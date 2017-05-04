package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Activity;
import com.neon.scams.domain.Student;

public interface ActivityService extends DaoSupport<Activity>{

	List<Activity> findByStudentAndTerm(Student stu, String aterm);

}
