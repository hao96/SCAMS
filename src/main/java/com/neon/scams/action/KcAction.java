package com.neon.scams.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.neon.scams.base.ActionBase;
import com.neon.scams.domain.Course;
import com.neon.scams.domain.S_C;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.neon.scams.service.S_CService;
import com.neon.scams.service.StudentService;
import com.neon.scams.service.impl.S_CServiceImpl;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class KcAction extends ActionBase<S_C>{
	public String snum;

//====================part2==========================================
		//转到录入UI
		public String stukclog(){
			return "stukclog";
		}
		
		public String kcPrepare(){
			Student stu = studentService.findOneByNum(snum);
			List<S_C> sclist = s_cService.findBySnumAndTerm(stu,model.getTerm());
			ActionContext.getContext().getSession().put("stu", stu);
			ActionContext.getContext().put("sclist", sclist);
			return "kcPrepare";
		}
		
		//录入课程成绩
		public String tostukclog(){
			Student stu = (Student) ActionContext.getContext().getSession().get("stu");
			String[] courses = s_cService.getCoursesByCourse(model.getCourse().getCname());
			String[] cores = s_cService.getCoresByCore(model.getCore());

			for(int i = 0 ; i < courses.length ; i++){
				Course cour = courseService.findByCourseName(courses[i]);
				S_C sc = s_cService.findByStudentAndCourse(stu,cour);
				sc.setCore(cores[i]);
				s_cService.update(sc);
			}
			return "stukclog";
		}
		
		public String stukcselect(){
			
			return "stukcselect";
		}
		
		public String tostukcselect(){
			Student stu = studentService.findOneByNum(snum);
			List<S_C> scs = s_cService.findBySnumAndTerm(stu, model.getTerm());
			ActionContext.getContext().put("scs", scs);
			return "stukcselect";
		}
		
		public String stukcalter(){
			S_C sc = s_cService.getById(model.getId());
			ActionContext.getContext().getValueStack().push(sc);;
			return "stukcalter";
		}
		
		public String tostukcalter(){
			S_C sc = s_cService.getById(model.getId());
			sc.setCore(model.getCore());
			s_cService.update(sc);
			return "stukcselect";
		}
		
		public String mykcselect(){
			User user = (User) ActionContext.getContext().getSession().get("user");
			Student stu = studentService.findOneByNum(user.getNumber());
			List<S_C> sc = s_cService.findBySnumAndTerm(stu, model.getTerm());
			ActionContext.getContext().put("sc", sc);
			return "mykcselect";
		}
		
		public String myzcselect(){
			return "myzcselect";
		}
		
		public String tomyzcselect(){
			User user = (User) ActionContext.getContext().getSession().get("user");
			Student stu = studentService.findOneByNum(user.getNumber());
			List<S_C> sc = s_cService.findBySnumAndTerm(stu, model.getTerm());
			Map<String, String> zc = new HashMap<>();
			zc.put("yang", "10");
			
			ActionContext.getContext().put("zc", zc);
			return "myzcselect";
		}
		
//======================================================
		public String getSnum() {
			return snum;
		}

		public void setSnum(String snum) {
			this.snum = snum;
		}



}
