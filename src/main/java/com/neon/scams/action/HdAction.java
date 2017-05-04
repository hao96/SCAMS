package com.neon.scams.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mchange.v2.cfg.PropertiesConfigSource.Parse;
import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Activity;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.neon.scams.tool.Term;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class HdAction extends ActionBase<Activity>{
	
	public String snum;
	
	public String stuhdlog(){
		List<String> terms = Term.getTerm();
		ActionContext.getContext().put("terms", terms);
		return "stuhdlog";
	}
	
	public String tostuhdlog(){
		if(snum != null){
			Student stu = studentService.findOneByNum(snum);
			Activity ac = new Activity();
			
			ac.setStudent(stu);
			ac.setAcon(model.getAcon());
			ac.setAday(model.getAday());
			ac.setAscore(model.getAscore());
			ac.setAterm(model.getAterm());
			
			activityService.save(ac);
		}
		return "tostuhdlog";
	}

	public String stuhdselect(){
		List<String> terms = Term.getTerm();
		ActionContext.getContext().put("terms", terms);
		return "stuhdselect";
	}
	
	public String tostuhdselect(){
		List<String> terms = Term.getTerm();
		ActionContext.getContext().put("terms", terms);
		Student stu = studentService.findOneByNum(snum);
		List<Activity> acs = activityService.findByStudentAndTerm(stu,model.getAterm());
		ActionContext.getContext().put("acs", acs);
		return "stuhdselect";
	}
	
	public String stuhdalter(){
		Activity ac = activityService.getById(model.getId());
		ActionContext.getContext().put("ac", ac);
		ActionContext.getContext().getValueStack().push(ac);
		return "stuhdalter";
	}
	
	public String tostuhdalter(){
		Activity ac = activityService.getById(model.getId());
		ac.setAcon(model.getAcon());
		ac.setAscore(model.getAscore());
		ac.setAday(model.getAday());
		activityService.update(ac);
		return "tostuhdalter";
	}
	
	public String delete(){
		activityService.delete(model.getId());
		return "tostuhdalter";
	}
	
	public String myhdselect(){
		return "myhdselect";
	}
	
	public String tomyhdselect(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		Student stu = studentService.findOneByNum(user.getNumber());
		List<Activity> acs = activityService.findByStudentAndTerm(stu, model.getAterm());
		Float hd_core = null;
		for(Activity ac : acs){
			hd_core = Float.valueOf(ac.getAscore());
		}
		ActionContext.getContext().put("hd_core", hd_core);
		return "myhdselect";
	}
	
	public String myhdselectde(){
		return "myhdselectde";
	}
	
	public String tomyhdselectde(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		Student stu = studentService.findOneByNum(user.getNumber());
		List<Activity> acs = activityService.findByStudentAndTerm(stu, model.getAterm());
		ActionContext.getContext().put("acs", acs);
		return "myhdselectde";
	}
	
	//=====================================================
	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}
}
