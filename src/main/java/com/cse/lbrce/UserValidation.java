package com.cse.lbrce;

import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String name,String pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UID=rb.getString("uname");
		String PSW=rb.getString("pwd");
		if(name.equals(UID)&&pwd.equals(PSW))
			return true;
		else
			return false;
	}

}
