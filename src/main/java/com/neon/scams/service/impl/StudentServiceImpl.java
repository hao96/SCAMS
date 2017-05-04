package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Student;
import com.neon.scams.service.StudentService;

@Service
public class StudentServiceImpl extends DaoSupportImpl<Student> implements StudentService{

	@Override
	public boolean snumAgain(String snum) {
		Student student = (Student) getSession().createQuery(//
				"FROM Student s WHERE s.snum=?")//
				.setParameter(0, snum)
				.uniqueResult();
		if(student == null){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<Student> findByNum(String snum) {
		return  getSession().createQuery(//
				"FROM Student s WHERE s.snum=?")//
				.setParameter(0, snum)
				.list();
	}

	@Override
	public List<Student> findByDeAndClass(String sde, String sclass) {
		return getSession().createQuery(//
				"FROM Student s WHERE s.sde=? AND s.sclass=?")//
				.setParameter(0, sde)
				.setParameter(1, sclass)
				.list();
	}

	@Override
	public List<Student> findByDeAndClassAndName(String sde, String sclass, String sname) {
		return getSession().createQuery(//
				"FROM Student s WHERE s.sde=? AND s.sclass=? AND sname=?")//
				.setParameter(0, sde)
				.setParameter(1, sde)
				.setParameter(2, sname)
				.list();
	}

	@Override
	public Student findOneByNum(String snum) {
		return (Student) getSession().createQuery(//
				"FROM Student s WHERE s.snum=?")
				.setParameter(0, snum)
				.uniqueResult();
	}


}
