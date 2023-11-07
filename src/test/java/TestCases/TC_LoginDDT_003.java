//package TestCases;
//
//import java.io.IOException;
//
//
//	//import org.junit.Assert;
//	import org.openqa.selenium.NoAlertPresentException;
//	import org.testng.annotations.DataProvider;
//	import org.testng.annotations.Test;
//
//	//import PageObjects.Loginpage;
//import PageObjects.Loginpage;
//import Utilities.XLUtils1;
//
//	public class TC_LoginDDT_003  extends BaseClass {
//
//		@Test(dataProvider="Logindata")
//		public void loginDDT(String user,String pwd) throws InterruptedException
//		{
//		Loginpage lo=new Loginpage(driver);
//			driver.get(url);
//			log.info("url is enter");
//			
//
//			lo.setmail(user);
//			log.info("email is entered");
//			Thread.sleep(3000);
//
//			lo.setpassbutton();
//			
//            lo.setpassword(pwd);
//			log.info("password is entered");
//			Thread.sleep(3000);
//			lo.setlogin();
//			Thread.sleep(3000);
//			lo.setcategories();
//			//Thread.sleep(3000);
////			lo.setcategories();
//		    //Thread.sleep(2000);
////			lo.setLogout();
//
//			Thread.sleep(3000);
//		}
//		//
//		//			/*	if(isAlertPresent()==true)
//		//			{
//		//				driver.switchTo().alert().accept();//close alert
//		//				driver.switchTo().defaultContent();
//		//				Assert.assertTrue(false);
//		//				logger.warn("Login failed");
//		//			}*/
//		//			/*		else
//		//			{
//		//				Assert.assertTrue(true);
//		//				logger.info("Login passed");
//		//				lp.clickLogoutbtn();
//		//				Thread.sleep(3000);
//		//				driver.switchTo().alert().accept();//close logout alert
//		//				driver.switchTo().defaultContent();
//		//
//		//			}
//		//
//		//
//		//		}*/
//		//
//		//
//		//			/*	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
//		//		{
//		//			try
//		//			{
//		//			driver.switchTo().alert();
//		//			return true;
//		//			}
//		//			catch(NoAlertPresentException e)
//		//			{
//		//				return false;
//		//			}*/
//		//
//		//		}
//		//
//		//
//		@DataProvider(name="Logindata")
//		String [][] getData() throws IOException
//		{
//			String path=System.getProperty("user.dir")+"/src/test/java/TestData/Logindata.xlsx";
//
//			int rownum=XLUtils1.getRowCount(path, "Sheet1");
//			int colcount=XLUtils1.getCellCount(path,"Sheet1",1);
//
//			String LoginData[][]=new String[rownum][colcount];
//
//			for(int i=1;i<=rownum;i++)
//			{
//				for(int j=0;j<colcount;j++)
//				{
//					LoginData[i-1][j]=XLUtils1.getCellData(path,"Sheet1", i,j);//1 0
//				}
//
//			}
//			return LoginData;
//		}
//	}
//
//
//
//
//
