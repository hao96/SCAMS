package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Activity;
import com.neon.scams.domain.Student;
import com.neon.scams.service.ActivityService;

@Service
public class ActivityServiceImpl extends DaoSupportImpl<Activity> implements ActivityService{

	@Override
	public List<Activity> findByStudentAndTerm(Student stu, String aterm) {
		return getSession().createQuery(//
				"FROM Activity ac WHERE ac.student=? AND aterm=?")//
				.setParameter(0, stu)
				.setParameter(1, aterm)
				.list();
	}

}
