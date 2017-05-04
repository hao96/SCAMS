package com.neon.scams.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.neon.scams.base.DaoSupportImpl;
import com.neon.scams.domain.Power;
import com.neon.scams.service.PowerService;

@Service
public class PowerServiceImpl extends DaoSupportImpl<Power> implements PowerService{

	@Override
	public List<Power> findPowerByAdminAndPart(int admin, int i) {
		return getSession().createQuery(//
				"FROM Power p WHERE p.admin=? AND p.part=?")//
				.setParameter(0, admin)
				.setParameter(1, i)
				.list();
	}

}
