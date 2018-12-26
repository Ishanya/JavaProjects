package service;

import java.util.Calendar;
import java.util.regex.Pattern;

import model.Customer;

public class ProfileSubmit {

	public static boolean validation(String dob,String gender) {
		// TODO Auto-generated method stub
		
		Customer cust=new Customer();
		
	//	String dob=cust.getDob();
		//String gender=cust.getGender();
		
		if(Pattern.matches("[0-3][0-9][/][0-1][0-9][/][0-9]{4}", dob) && Pattern.matches("[M]?[F]?", gender)) {
			
			String s[]= dob.split("/", 0);
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			int birth=Integer.parseInt(s[2]);
			cust.setAge((currentYear-birth));
			System.out.println("Successful profile updated");
			System.out.println("Wow! you are "+cust.getAge());
		
			
			
		}
		else {
			System.out.println("Something is wrong with the data input");
			
		}
		return true;
		}
		
	}
		
	
	

