package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Course;
import com.neon.scams.domain.Pe;
import com.neon.scams.domain.S_C;
import com.neon.scams.domain.S_P;
import com.neon.scams.domain.Student;
import com.neon.scams.service.S_PService;

@Service
public class S_PServiceImpl extends DaoSupportImpl<S_P> implements S_PService{

	@Override
	public List<S_P> findByStuAndTerm(Student stu, String term) {
		return getSession().createQuery(
				"FROM S_P sp WHERE sp.student=? AND sp.term=?")
				.setParameter(0, stu)
				.setParameter(1, term)
				.list();
	}

	@Override
	public String[] getPesByPe(String pname) {
		
		return pname.split(", ");
	}

	@Override
	public String[] getCoresByCore(String core) {
		return core.split(", ");
	}



	@Override
	public Pe findByPeName(String string) {
		return (Pe) getSession().createQuery(//
				"FROM Pe p WHERE p.pname=?")
				.setParameter(0, string)
				.uniqueResult();
	}

	@Override
	public S_P findByStudentAndPe(Student stu, Pe pe) {
		return 	(S_P) getSession().createQuery(//
				"FROM S_P sp WHERE sp.student=? AND sp.pe=?")
				.setParameter(0, stu)
				.setParameter(1, pe)
				.uniqueResult();
	}




}
