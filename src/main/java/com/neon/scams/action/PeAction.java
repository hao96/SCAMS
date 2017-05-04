package com.neon.scams.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Course;
import com.neon.scams.domain.Pe;
import com.neon.scams.domain.S_C;
import com.neon.scams.domain.S_P;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class PeAction extends ActionBase<S_P>{
	
	public String snum;

	public String stutylog(){
		return "stutylog";
	}
	
	public String pePrepaer(){
		Student stu = studentService.findOneByNum(snum);
		List<S_P> splist = spService.findByStuAndTerm(stu,model.getTerm());
		ActionContext.getContext().getSession().put("stu", stu);
		ActionContext.getContext().put("splist", splist);
		return "stutylog";
	}
	
	public String tostutylog(){
		Student stu = (Student) ActionContext.getContext().getSession().get("stu");
		String[] pes = spService.getPesByPe(model.getPe().getPname());
		String[] cores = spService.getCoresByCore(model.getCore());

		for(int i = 0 ; i < pes.length ; i++){
			System.out.println(pes[i]);
			System.out.println(cores[i]);
		}
		
		for(int i = 0 ; i < pes.length ; i++){
			Pe pe = spService.findByPeName(pes[i]);
			S_P sp = spService.findByStudentAndPe(stu,pe);
			sp.setCore(cores[i]);
			spService.update(sp);
		}
		return "stutylog";
	}
	
	public String stutyselect(){
		Student stu = studentService.findOneByNum(snum);
		List<S_P> sps = spService.findByStuAndTerm(stu, model.getTerm());
		ActionContext.getContext().put("sps", sps);
		return "stutyselect";
	}
	
	public String stutyalter(){
		S_P sp = spService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(sp);
		ActionContext.getContext().put("sp", sp);
		return "stutyalter";
	}
	
	public String tostutyalter(){
		S_P sp = spService.getById(model.getId());
		sp.setCore(model.getCore());
		sp.setTerm(model.getTerm());
		spService.update(sp);
		return "stutyselect";
	}
	
	public String delete(){
		spService.delete(model.getId());
		return "stutyselect";
	}
	
	public String mytyselect(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		Student stu = studentService.findOneByNum(user.getNumber());
		List<S_P> sp = spService.findByStuAndTerm(stu, model.getTerm());
		ActionContext.getContext().put("sp", sp);
		return "mytyselect";
	}
	
//======================================================
	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}
}
