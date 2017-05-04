package com.neon.scams.service;

import java.util.List;

import com.neon.scams.base.DaoSupport;
import com.neon.scams.domain.Power;

public interface PowerService extends DaoSupport<Power>{

	List<Power> findPowerByAdminAndPart(int admin, int i);

}
