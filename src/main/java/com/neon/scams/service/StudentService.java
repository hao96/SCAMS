package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Student;

public interface StudentService extends DaoSupport<Student> {

	boolean snumAgain(String snum);

	List<Student> findByNum(String snum);

	List<Student> findByDeAndClass(String sde, String sclass);

	List<Student> findByDeAndClassAndName(String sde, String sclass, String sname);

	Student findOneByNum(String snum);



}
