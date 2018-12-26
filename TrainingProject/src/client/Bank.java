package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.StorageInput;
import model.Customer;
import model.LoggedInUser;
import model.SignedupUser;
import service.Login;
import service.ProfileSubmit;
import service.SignUp;

public class Bank {
	
	Scanner sc=new Scanner(System.in);
	LoggedInUser log=new LoggedInUser();
	SignedupUser sign=new SignedupUser();
	Customer cust=new Customer();
	static int l=0;
	SignedupUser ip;
	
//	static ArrayList<SignedupUser> signedup=new ArrayList<SignedupUser>();
	//static SignedupUser arr[] =new SignedupUser[100];
	
	public static void main(String z[]) throws IOException, ClassNotFoundException
	{
		System.out.println("hello");
		boolean val=true;
		while(val) {
		Bank userid=new Bank();
		val=userid.getData();
		}
	}
	
	public boolean getData() throws IOException, ClassNotFoundException
	{
		Bank user=new Bank();
		System.out.println("Are you an existing User? (yes/no/out)");
		String choose=sc.nextLine();
		if(choose.equalsIgnoreCase("yes"))
		{
			return user.getLogin();
			
		}
		else if(choose.equalsIgnoreCase("no")) {
			user.getSignup();
			return true;
		}
		else {
			System.out.println("Logged Out! Please run again");
			System.exit(0);
		}
		return false;
	}
	
	public boolean getLogin() throws ClassNotFoundException, IOException
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter Id");
		String lid=sc.nextLine();
		//log.setName(name);
		System.out.println("enter password");
		String pass=sc.nextLine();
		//log.setPassword(pass);
		//System.out.println(this.signedup.size());
		
		return Login.validate(lid,pass);
		//return Login.validate(arr,name,pass);
		
		//LoggedInUser ip=new LoggedInUser(name,pass);
		//logged.add(ip);
		
	}
	
	public void getSignup() throws IOException, ClassNotFoundException
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		sign.setName(name);
		
		System.out.println("enter password");
		String pass=sc.nextLine();
		sign.setPassword(pass);
		
		System.out.println("confirm password");
		String cnfpass=sc.nextLine();
		sign.setCnfpassword(cnfpass);
		
		if(SignUp.validateData(sign,name,pass,cnfpass)) {
			
		
		StorageInput.saveCustomer(sign);
		//signedup.add(ip);
		
		//System.out.println(arr.length);
		//l++;
	//	signedup.add(ip);
		//System.out.println(i.getName()+" "+i.getPassword());
		/*	for(int i=0;i<arr.length;i++)
			{
				System.out.println(l);
			if(arr[i]!=null)
			{
				System.out.println(arr[i].getName()+" "+arr[i].getPassword());
			}
				else{
				break;
				}
			}*/
		
		}
		else {
			System.out.println("Something wrong with the format of input data! or password does match");
		}
	}

	public boolean getProfile(String wid) {
		System.out.println("Welcome "+wid);
		System.out.println("Wanna update your profile? (yes/no)");
		String prof=sc.nextLine();
		boolean valid;
		
		if(prof.equalsIgnoreCase("yes")){
			cust.setName(sign.getName());
			System.out.println("Enter dob in (DD/MM/YYYY): ");
			String dob=sc.nextLine();
			cust .setDob(dob);
			System.out.println("Enter your gender(M/F): ");
			String gender=sc.nextLine();
			cust.setGender(gender);
			
			valid= ProfileSubmit.validation(dob,gender);
			if(valid==true)
			{
				System.out.println(wid+" "+dob+" "+gender);
				return true;
			}
			return true;
		}
		else {
			System.out.println("Thankyou for your time!");
				return true;
		}
		
	}


}

