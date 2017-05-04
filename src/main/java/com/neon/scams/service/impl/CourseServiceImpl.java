package com.neon.scams.service.impl;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Course;
import com.neon.scams.service.CourseService;

@Service
public class CourseServiceImpl extends DaoSupportImpl<Course> implements CourseService{

	@Override
	public Course findByCourseName(String string) {
		return (Course) getSession().createQuery(//
				"FROM Course c WHERE c.cname=?")//
				.setParameter(0, string)
				.uniqueResult();
	}

}
