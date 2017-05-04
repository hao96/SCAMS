package com.neon.rs.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.neon.scams.service.StudentService;
import com.neon.scams.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class TestHiber extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserService userService;
	@Resource
	private StudentService studentService;
	
	@Test
	public void testH(){
		

		Student student = new Student();
		student.setSname("yy");
		
		studentService.save(student);
	}
}
