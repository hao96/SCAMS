package com.neon.scams.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.neon.scams.service.ActivityService;
import com.neon.scams.service.CourseService;
import com.neon.scams.service.ErrorService;
import com.neon.scams.service.InnovateService;
import com.neon.scams.service.PowerService;
import com.neon.scams.service.S_CService;
import com.neon.scams.service.S_PService;
import com.neon.scams.service.StudentService;
import com.neon.scams.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public abstract class ActionBase<T> extends ActionSupport implements ModelDriven<T>{

	public T model;
	
	//-------------------modeldriven的支持-----------------------------------------------
	
	public ActionBase(){
		try{
			//通过反射技术获得model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			//通过反射创建model的实例
			this.model = clazz.newInstance();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public T getModel(){
		return model;
	}
	
	//--------------------Service实例的声明------------------------------------------------------------
	@Resource
	public UserService userService;
	@Resource
	public StudentService studentService;
	@Resource
	public PowerService powerService;
	@Resource
	public S_CService s_cService;
	@Resource
	public ActivityService activityService;
	@Resource
	public InnovateService innovateService;
	@Resource
	public ErrorService errorService;
	@Resource
	public CourseService courseService;
	@Resource
	public S_PService spService;
	
}
