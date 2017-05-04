package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Course;
import com.neon.scams.domain.S_C;
import com.neon.scams.domain.Student;

public interface S_CService extends DaoSupport<S_C>{

	List<S_C> findBySnumAndTerm(Student stu, String term);

	String[] getCoursesByCourse(String course);

	String[] getCoresByCore(String core);

	S_C findByStudentAndCourse(Student stu, Course cour);



}
