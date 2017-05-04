package com.neon.scams.service.impl;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Student;
import com.neon.scams.domain.User;
import com.neon.scams.service.UserService;

@Service
public class UserServiceImpl extends DaoSupportImpl<User> implements UserService{

	@Override
	public User login(String number, String password) {
		
		return (User) getSession().createQuery(
				"FROM User u WHERE u.number=? AND password=?")//
				.setParameter(0, number)
				.setParameter(1, password)
				.uniqueResult();
	}

	@Override
	public String getNumLastSix(String snum) {
		String lastSix = "";
	    String str = snum;
	    String[] strs = str.split("");
	    for (int i = 2 ; i < 8 ; i++){
	      lastSix += strs[i]; 
	    } 
		return lastSix;
	}



	
}
