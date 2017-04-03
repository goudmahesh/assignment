package com.javatpoint;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet; 
public class Register {

	private String username,userpass;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getUserpass() {
		return userpass;
	}



	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}



	public String execute() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@MAHESHGOUD:1521:xe", "system", "tiger");
			PreparedStatement ps = con.prepareStatement("insert  into user3333(name,password) values(?,?)");
			ps.setString(1, username);
			ps.setString(2, userpass);
			ResultSet rs = ps.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

}
