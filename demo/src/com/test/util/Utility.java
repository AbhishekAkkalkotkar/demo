package com.test.util;

import javax.servlet.http.HttpServletRequest;

public class Utility {

	public String truncate(String str, int size) {
		String truncate = "... (truncated) ...";
		String tComplet = "";
		if (size <= 25 && str.length() <= 25 ) {
			tComplet = str;
		} else {
			if (str.length() > size) {
				float actuallen = size - truncate.length();
				int firststr = (int) Math.floor(actuallen / 2);
				int laststr = str.length() - (int) Math.ceil(actuallen / 2);
				tComplet = str.substring(0, firststr) + truncate + str.substring(laststr, str.length());
			}
		}
		return tComplet;
	}

	public String getOrderDetails(HttpServletRequest request) {
		return "";
	}

	
	public static void main(String[] args) {
	 Utility utility =new Utility();
	 String str ="12345678912345678912345";
	 String output = utility.truncate(str, 25);
	 System.out.println(output);
	}
	
}
