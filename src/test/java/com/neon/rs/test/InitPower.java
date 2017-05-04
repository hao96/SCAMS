package com.neon.rs.test;


import java.util.HashMap;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neon.scams.domain.Power;
import com.neon.scams.service.PowerService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml")  
public class InitPower extends AbstractJUnit4SpringContextTests{
	
	@Resource
	PowerService powerService;
	
	@Test
	public void initPower(){
		
		HashMap<String, String> powers1 = new HashMap<>();
		HashMap<String, String> powers2 = new HashMap<>();
		HashMap<String, String> powers3 = new HashMap<>();
		HashMap<String, String> powers4 = new HashMap<>();
		HashMap<String, String> powers5 = new HashMap<>();
		HashMap<String, String> powers_2 = new HashMap<>();
		
		powers1.put("信息查询", "admin_stuselect.action");
		powers_2.put("我的基本信息", "admin_myxxselect.action");
		powers1.put("信息录入", "admin_stulog.action");
		powers1.put("信息修改", "admin_stualter.action");
		powers1.put("404页面", "error.action");
		powers2.put("课程成绩录入", "kc_stukclog.action");
		powers2.put("课程成绩查询", "kc_stukcselect.action");
		powers_2.put("我的课程成绩", "kc_mykcselect.action");
		powers2.put("课程成绩修改", "kc_stukcalter.action");
		powers2.put("活动成绩查询", "hd_stuhdselect.action");
		powers_2.put("我的活动成绩", "hd_myhdselect.action");
		powers2.put("体育成绩录入", "pe_stutylog.action");
		powers2.put("体育成绩查询", "pe_stutyselect.action");
		powers_2.put("我的体育成绩", "pe_mytyselect.action");
		powers2.put("体育成绩修改", "pe_stutyalter.action");
		powers2.put("综测成绩查询", "zc_stuzcselect.action");
		powers_2.put("我的综测成绩", "zc_myzcselect.action");
		powers3.put("创新分录入", "cx_stucxlog.action");
		powers3.put("创新分查询", "cx_stucxselect.action");
		powers_2.put("我的创新分", "cx_mycxselect.action");
		powers3.put("创新分修改", "cx_stucxalter.action");
		powers4.put("活动成绩录入", "hd_stuhdlog.action");
		powers4.put("活动成绩查询", "hd_stuhdselect.action");
		powers_2.put("我的活动成绩", "hd_myhdselectde.action");
		powers5.put("待处理异常", "error_errorwait.action");
		powers5.put("异常处理", "error_errordo.action");
		powers5.put("异常申请", "error_errorapply.action");
		
		
		
		for(Entry<String, String> map : powers1.entrySet()){
					
					Power power = new Power();
					power.setAdmin(1);
					power.setName(map.getKey());
					power.setAction(map.getValue());
					power.setPart(1);
					powerService.save(power);
				}
		for(Entry<String, String> map : powers2.entrySet()){
			
			Power power = new Power();
			power.setAdmin(1);
			power.setName(map.getKey());
			power.setAction(map.getValue());
			power.setPart(2);
			powerService.save(power);
		}
		for(Entry<String, String> map : powers3.entrySet()){
			
			Power power = new Power();
			power.setAdmin(1);
			power.setName(map.getKey());
			power.setAction(map.getValue());
			power.setPart(3);
			powerService.save(power);
		}
				
		for(Entry<String, String> map : powers4.entrySet()){
			
			Power power = new Power();
			power.setAdmin(1);
			power.setName(map.getKey());
			power.setAction(map.getValue());
			power.setPart(4);
			powerService.save(power);
		}
		for(Entry<String, String> map : powers5.entrySet()){
			
			Power power = new Power();
			power.setAdmin(1);
			power.setName(map.getKey());
			power.setAction(map.getValue());
			power.setPart(5);
			powerService.save(power);
		}
		for(Entry<String, String> map : powers_2.entrySet()){
			
			Power power = new Power();
			power.setAdmin(0);
			power.setName(map.getKey());
			power.setAction(map.getValue());
			
			powerService.save(power);
		}
		

	}
}
