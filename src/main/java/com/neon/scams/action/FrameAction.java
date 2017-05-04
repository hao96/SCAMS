package com.neon.scams.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Power;
import com.neon.scams.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class FrameAction extends ActionBase<Power>{
	
	User user = (User) ActionContext.getContext().getSession().get("user");
	
	public String topUI(){
		return "topUI";
	}
	
	public String leftUI(){
		
		
		
		List<Power> part1 = powerService.findPowerByAdminAndPart(user.getAdmin(),1);
		List<Power> part2 = powerService.findPowerByAdminAndPart(user.getAdmin(),2);
		List<Power> part3 = powerService.findPowerByAdminAndPart(user.getAdmin(),3);
		List<Power> part4 = powerService.findPowerByAdminAndPart(user.getAdmin(),4);
		List<Power> part5 = powerService.findPowerByAdminAndPart(user.getAdmin(),5);
		
		
		
		ActionContext.getContext().put("part1",part1);
		ActionContext.getContext().put("part2",part2);
		ActionContext.getContext().put("part3",part3);
		ActionContext.getContext().put("part4",part4);
		ActionContext.getContext().put("part5",part5);
		
		
		return "leftUI";
	}
	
	public String indexUI(){
		return "indexUI";
	}

}
