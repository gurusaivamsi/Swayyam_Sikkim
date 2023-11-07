package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Loginpage;

public class Tc001_Login extends BaseClass {
	@Test
	public void logintest() throws IOException  {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		log.info("url is enter");
		driver.manage().window().maximize();

		Loginpage lo=new Loginpage(driver);

		lo.setmail(email);
		log.info("email is entered");

		lo.setpassbutton();

		lo.setpassword(password);
		log.info("password is entered");
		lo.setlogin();
		lo.setcategories();
//		lo.setLogout();
		String actual_res=driver.getTitle();

		String exp_res="Buy th best organic products, spices, handlooms and more at reasonable prices. Order directly from producers through Swayam Sikkim.";
		System.out.println(actual_res);
		if(actual_res.equals(exp_res)){
			Assert.assertTrue(true);
			log.info("testcase is passed");

		}
		else{
			captureScreenshot( driver,"logintest" );
			Assert.assertFalse(true);
			log.info("testcase is failed");
		}
	}
}





