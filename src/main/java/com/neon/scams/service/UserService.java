package com.neon.scams.service;


import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.User;

public interface UserService extends DaoSupport<User>{

	User login(String number, String password);

	String getNumLastSix(String snum);


}
