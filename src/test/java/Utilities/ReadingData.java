package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingData {
	Properties pro;
	public ReadingData(){
		File file=new File("./Configurations/Vamsi.properties");
		try {
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e){
			System.out.println("exception is "+e.getMessage());

		}
	}	
	public String getapplicationurl() {
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getemail() {
		String mail=pro.getProperty("email");
		return mail;
	}
	public String getpassword() {
		String pass=pro.getProperty("password");
		return pass;
	}
}










