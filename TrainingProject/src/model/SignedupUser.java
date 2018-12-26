package model;

import java.io.Serializable;

public class SignedupUser implements Serializable {

	private String name;
	private String password;
	private String cnfpassword;
	private String id;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SignedupUser() {
		super();
	}

	public SignedupUser(String name, String password, String cnfpassword) {
		super();
		this.name = name;
		this.password = password;
		this.cnfpassword = cnfpassword;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfpassword() {
		return cnfpassword;
	}
	public void setCnfpassword(String cnfpassword) {
		this.cnfpassword = cnfpassword;
	}


	
	
	
}
