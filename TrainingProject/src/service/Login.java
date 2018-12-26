package service;

import java.io.IOException;
import java.util.ArrayList;

import model.LoggedInUser;
import model.SignedupUser;
import java.util.regex.*;

import client.Bank;
import dao.ValidUser; 

public class Login {
	
	
	public static boolean validate(String lid,String lpass) throws ClassNotFoundException, IOException {
		LoggedInUser log=new LoggedInUser();
		//String lname=log.getName();	
		//String lpass=log.getPassword();
		int flag=0;
		if(Pattern.matches("[A-Za-z]{2}[0-9]{4}", lid) && Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", lpass))
		{
			//System.out.println(signedup.length);
			boolean val;
			
				
				if(ValidUser.getCustomer(lid,lpass))
				{
					Bank prof=new Bank();
					val=prof.getProfile(lid);
					if(val)
					{
						//System.out.println("Thankyou, logged out!");
						return true;
					}
					flag=1;
				
				}
		
			
			if(flag==0)
			{
				System.out.println("Username or Password is not correct");
				return true;
			}
			else {
				return false;
			}
			
			
			
		}
		else {
			System.out.println("Username or password is not in correct format");
			return true;
		}
		
	}

}
