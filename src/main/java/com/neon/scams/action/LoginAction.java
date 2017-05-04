package com.neon.scams.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class LoginAction extends ActionBase<User>{

	public String loginUI(){
		return "loginUI";
	}
	
	public String logout(){
		return "logout";
	}
	
	public String main(){
		
		return "main";
	}
	
	public String toLogin(){
		User user = userService.login(model.getNumber(),model.getPassword());
		if(user == null){
			addFieldError("login", "登录名或密码错误");
			return "loginUI";
		}else{
			//跳转到主页面
			System.out.println(powerService);
			ActionContext.getContext().getSession().put("user", user);
			return "toLogin";
		}
	}
}
