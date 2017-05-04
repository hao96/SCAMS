package com.neon.scams.service.impl;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Error;
import com.neon.scams.service.ErrorService;

@Service
public class ErrorServiceImpl extends DaoSupportImpl<Error> implements ErrorService{

}
