package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Innovate;
import com.neon.scams.domain.Student;
import com.neon.scams.service.InnovateService;

@Service
public class InnovateServiceImpl extends DaoSupportImpl<Innovate> implements InnovateService{

	@Override
	public List<Innovate> findByStudentAndTerm(Student stu, String iterm) {
		return getSession().createQuery(//
				"FROM Innovate inn WHERE inn.student=? AND inn.iterm=?")//
				.setParameter(0, stu)
				.setParameter(1, iterm)
				.list();
	}

}
