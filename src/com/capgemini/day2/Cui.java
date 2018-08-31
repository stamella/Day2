package com.capgemini.day2;

public class Cui {

	public static int checkid(String userid, String password, String id, String pass) {
		// TODO Auto-generated method stub
		if(userid.equals(id)&&password.equals(pass)) {
			return 1;
		}
		else
		return 0;
	}

}
