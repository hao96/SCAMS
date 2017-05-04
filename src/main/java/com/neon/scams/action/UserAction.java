package com.neon.scams.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class UserAction extends ActionBase<User>{

	public String password(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		ActionContext.getContext().getValueStack().push(user);
		return "passwordalter";
	}
	
	public String topasswordalter(){
		User user = userService.getById(model.getId());
		user.setPassword(model.getPassword());
		userService.update(user);
		return "passwordalter";
	}
}
