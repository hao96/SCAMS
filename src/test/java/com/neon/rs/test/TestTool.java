package com.neon.rs.test;

import org.junit.Test;

public class TestTool {

	@Test
	 public void strSplit() {
			String str_1 = "";
		    String str = "20150001";
		    String[] strs = str.split("");
		    for (int i = 2 ; i < 8 ; i++){
		      str_1 += strs[i]; 
		    } 
		    System.out.println(str_1);
	}
	
}
