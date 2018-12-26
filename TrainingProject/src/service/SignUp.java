package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.*;

import dao.StorageInput;
import model.SignedupUser;

public class SignUp{
	
	
	public static ArrayList<SignedupUser> signedup=new ArrayList<SignedupUser>();
	//static SignedupUser sign=new SignedupUser();
	
        public static boolean validateData(SignedupUser sign, String name,String pass,String cnfpass) throws IOException {
		
		/*String name=sign.getName();
		System.out.println(name);
		String pass=sign.getPassword();
		System.out.println(pass);
		String cnfpass=sign.getCnfpassword();
		System.out.println(cnfpass);*/
		//System.out.println("heelo");
		
		if(Pattern.compile("[A-Za-z]{2,}").matcher(name).matches() && Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$").matcher(pass).matches() && pass.equals(cnfpass)) 
		{
			Random rand = new Random();
			sign.setId(name.substring(0, 2)+String.format("%04d", rand.nextInt(10000)));
			System.out.println("please NOTE UR UNIQUE ID: "+sign.getId());
			//String id=name.substring(0, 2)+sign.getId();
			//FileWriter fw=new FileWriter("data.txt");
			//StorageInput.gettingId(sign,id);
			
			return true;
		}
		else {
			//System.out.println("Something fishy!!");
			return false;
		}
	
	}

        
        
	
	
	
}

	
