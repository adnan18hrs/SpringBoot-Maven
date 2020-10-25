package com.example.SmallWebApp;

public class UserRegistration {
	private String UName;
	private String EmailId;
	private String Password;
	private byte Gender;
	private String[] hobby;
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}

	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


	public byte getGender() {
		return Gender;
	}
	public void setGender(byte gender) {
		Gender = gender;
	}
	
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "UserRegistration [UName=" + UName + ", EmailId=" + EmailId + ", Password=" + Password + ", Gender="
				+ Gender + "]";
	}
}
