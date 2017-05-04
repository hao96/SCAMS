package com.neon.scams.action;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.neon.scams.tool.DeAndClass;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class AdminAction extends ActionBase<Student>{
	
//=================part1========================================	
	//转到修改UI
	public String stualter() throws Exception{
		if(model.getSnum() != null){			
			Student stu = studentService.findOneByNum(model.getSnum());
			Map<String,String> sdes = DeAndClass.getDes();
			Map<String,String> sclasses = DeAndClass.getClasses();
			ActionContext.getContext().put("stu", stu);
			ActionContext.getContext().put("sclasses", sclasses);
			ActionContext.getContext().put("sdes", sdes);
			ActionContext.getContext().getValueStack().push(stu);
		}else{
			System.out.println(model.getSnum());
			Map<String,String> sdes = DeAndClass.getDes();
			Map<String,String> sclasses = DeAndClass.getClasses();
			ActionContext.getContext().put("sclasses", sclasses);
			ActionContext.getContext().put("sdes", sdes);
		}
		return "stualter";
	}
	
	//修改
	public String tostualter() throws Exception{
		
		Student stu = studentService.findOneByNum(model.getSnum());
		
		stu.setSbor(model.getSbor());
		stu.setSclass(model.getSclass());
		stu.setSde(model.getSde());
		stu.setSname(model.getSname());
		stu.setSnative(model.getSnative());
		stu.setSschoolday(model.getSschoolday());
		stu.setSsex(model.getSsex());
		
		studentService.update(stu);
		
		return "tostualter";
	}

	//转到查询UI
	public String stuselect() throws Exception{
		return "stuselect";
	}
	
	//查询(bug)
	public String tostuselect() throws Exception{
		//按学号查找

		/**
		 * 这有一个bug：
		 * 		model.getsnum()  得到的不知道是什么。
		 */

		if(model.getSnum() != ""){
			List<Student> stus = studentService.findByNum(model.getSnum());
			if(stus.size() == 0){
				addFieldError("nostu", "没有该学生");
			}else{
				ActionContext.getContext().put("stus", stus);
				return "stuselect"; 
			}
		}
		//按系别班级姓名查找
		if(model.getSde() != null && model.getSclass() != null && model.getSname() ==null){
			List<Student> stus = studentService.findByDeAndClass(model.getSde(),model.getSclass());
			ActionContext.getContext().put("stus", stus);
			return "stuselect";
		}else{
			List<Student> stus = studentService.findByDeAndClassAndName(model.getSde(),model.getSclass(),model.getSname());
			ActionContext.getContext().put("stus", stus);
/*			for(Student s : stus){
				System.out.println(s.getSname());
			}*/
			return "stuselect";
		}
	}
	
	//转到学生信息录入UI
	public String stulog() throws Exception{
		return "stulog";
	}
	
	//学生信息录入
	public String tostulog() throws Exception{
		if(studentService.snumAgain(model.getSnum())){
		
			Student stu = new Student();
			stu.setSnum(model.getSnum());
			stu.setSbor(model.getSbor());
			stu.setSde(model.getSde());
			stu.setSclass(model.getSclass());
			stu.setSname(model.getSname());
			stu.setSnative(model.getSnative());
			stu.setSsex(model.getSsex());
			stu.setSschoolday(model.getSschoolday());
			
			studentService.save(stu);
			
			//将该学生录入到user表中
			User user = new User();
			user.setNumber(model.getSnum());
			user.setAdmin(0);
			user.setPassword(userService.getNumLastSix(model.getSnum()));
			
			userService.save(user);
			
			return "stulog";
		}else{
			addFieldError("snum", "该学生已经被注册");
			return "stulog";
		}
	}

	//我的信息
	public String myxxselect() throws Exception{
		User user = (User) ActionContext.getContext().getSession().get("user");
		Student stu = studentService.findOneByNum(user.getNumber());
		ActionContext.getContext().getValueStack().push(stu);
		Map<String, String> sdes = DeAndClass.getDes();
		Map<String, String> sclasses = DeAndClass.getClasses();
		ActionContext.getContext().put("sdes", sdes);;
		ActionContext.getContext().put("sclasses", sclasses);;
		return "myxxselect";
	}
	
	


}
