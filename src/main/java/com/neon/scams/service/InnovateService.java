package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Innovate;
import com.neon.scams.domain.Student;

public interface InnovateService extends DaoSupport<Innovate>{

	List<Innovate> findByStudentAndTerm(Student stu, String iterm);

}
