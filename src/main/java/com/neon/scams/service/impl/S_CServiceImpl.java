package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Course;
import com.neon.scams.domain.S_C;
import com.neon.scams.domain.Student;
import com.neon.scams.service.S_CService;

@Service
public class S_CServiceImpl extends DaoSupportImpl<S_C> implements S_CService{


	@Override
	public List<S_C> findBySnumAndTerm(Student stu, String term) {
		return getSession().createQuery(//
				"FROM S_C sc WHERE sc.student=? AND term=?")//
				.setParameter(0, stu)
				.setParameter(1, term)
				.list();
	}

	@Override
	public String[] getCoursesByCourse(String course) {
		return course.toString().split(", ");
	}

	@Override
	public String[] getCoresByCore(String core) {
		return core.split(", ");
	}

	@Override
	public S_C findByStudentAndCourse(Student stu, Course cour) {
		return (S_C) getSession().createQuery(//
				"FROM S_C sc WHERE sc.student=? AND sc.course=?")//
				.setParameter(0, stu)
				.setParameter(1, cour)
				.uniqueResult();
	}




}
