package com.subbu.happycart;

public class Testing {
	public static void main( String[]args)
	{
		String Userid = null;
		String password = null;
		LoginDAO loginDAO =new LoginDAO();
		if( loginDAO.isValidUser(Userid,password)==true)
		{
			System.out.println("yes");
			
		}
		else
		{
		
			System.out.println("no");
		}
	}


}
