package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Pe;
import com.neon.scams.domain.S_P;
import com.neon.scams.domain.Student;

public interface S_PService extends DaoSupport<S_P>{

	List<S_P> findByStuAndTerm(Student stu, String term);

	String[] getPesByPe(String pname);

	String[] getCoresByCore(String core);

	Pe findByPeName(String string);

	S_P findByStudentAndPe(Student stu, Pe pe);

}
