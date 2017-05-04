package com.neon.scams.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Innovate;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class InnovateAction extends ActionBase<Innovate>{

	public String snum;
	
	public String stucxlog(){
		return "stucxlog";
	}
	
	public String tostucxlog(){
		Student stu = studentService.findOneByNum(snum);
		Innovate inn = new Innovate();
		inn.setIcon(model.getIcon());
		inn.setIday(model.getIday());
		inn.setIscore(model.getIscore());
		inn.setIterm(model.getIterm());
		inn.setStudent(stu);
		
		innovateService.save(inn);
		return "stucxlog";
	}
	
	public String stucxselect(){
		
		return "stucxselect";
	}
	
	public String tostucxselect(){
		System.out.println(snum);
		Student stu = studentService.findOneByNum(snum);
		List<Innovate> inns = innovateService.findByStudentAndTerm(stu,model.getIterm());
		ActionContext.getContext().put("inns", inns);
		return "stucxselect";
	}
	
	public String stucxalter(){
		Innovate inn = innovateService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(inn);
		return "stucxalter";
	}
	
	public String tostucxalter(){
		Innovate inn = innovateService.getById(model.getId());
		inn.setIcon(model.getIcon());
		inn.setIday(model.getIday());
		inn.setIscore(model.getIscore());
		
		innovateService.update(inn);
		return "stucxselect";
	}
	
	public String delete(){
		innovateService.delete(model.getId());
		return "stucxselect";
	}
	
	public String mycxselect(){
		return "mycxselect";
	}
	
	public String tomycxselect(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		Student stu = studentService.findOneByNum(user.getNumber());
		System.out.println(stu.getSname());
		List<Innovate> inns = innovateService.findByStudentAndTerm(stu,model.getIterm());
		ActionContext.getContext().put("inns", inns);
		return "mycxselect";
	}
//============================================
	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}
}
