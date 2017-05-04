package com.neon.scams.service;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Course;

public interface CourseService extends DaoSupport<Course>{

	Course findByCourseName(String string);

}
