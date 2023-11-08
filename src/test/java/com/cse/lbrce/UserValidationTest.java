package com.cse.lbrce;
import org.testng.Assert;
import org.testng.annotations.Test;


	
	public class UserValidationTest {
		@Test
		public void testCase1()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(true,uv.check("swetha", "1234"));
		}
		@Test
		public void testCase2()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("sam", "Sam@12345"));
		}
		
	}


