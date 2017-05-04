package com.neon.scams.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeAndClass {

	public static Map<String,String> getDes(){
		Map<String,String> des = new HashMap<String,String>();
		des.put("软件工程","软件工程");
		des.put("网络工程","网络工程");
		des.put("计算机原理","计算机原理");
		return des;
	}
	
	public static Map<String,String> getClasses(){
		Map<String,String> classes = new HashMap<String,String>();
		classes.put("15-1","15-1");
		classes.put("15-2","15-2");
		classes.put("15-3","15-3");
		classes.put("15-4","15-4");
		return classes;
	}
}
