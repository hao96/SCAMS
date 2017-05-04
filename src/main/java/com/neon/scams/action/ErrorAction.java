package com.neon.scams.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Error;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class ErrorAction extends ActionBase<Error>{

	public String errorapply(){
		return "errorapply";
	}
	
	public String toerrorapply(){
		System.out.println(ActionContext.getContext().getSession());
		User user = (User) ActionContext.getContext().getSession().get("user");
		System.out.println(user.getNumber());
		Student stu = studentService.findOneByNum(user.getNumber());
		System.out.println(stu.getSname());
		Error error = new Error();
		error.setEcon(model.getEcon());
		error.setEday(new Date().toString());
		error.setEtitle(model.getEtitle());
		error.setStudent(stu);
		
		errorService.save(error);
		return "errorapply";
	}
	
	public String errorwait(){
		List<Error> errors = errorService.findAll();
		ActionContext.getContext().put("errors", errors);
		return "errorwait";
	}
	
	public String errordo(){
		Error error = errorService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(error);
		return "errordo";
	}
	
	public String delete(){
		errorService.delete(model.getId());
		return "errorwait";
	}
}
