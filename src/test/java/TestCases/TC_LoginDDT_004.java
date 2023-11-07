package TestCases;


	import java.io.IOException;

	import org.testng.Assert;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import PageObjects.Loginpage;
	import Utilities.XLUtils1;

	public class TC_LoginDDT_004 extends BaseClass {

		@Test(dataProvider="Logindata")
		public void loginddt(String Email,String Password) throws InterruptedException, IOException
		{

		   Loginpage lo=new Loginpage(driver);

	        driver.get(url);
			lo.setmail(Email);
			Thread.sleep(3000);
			log.info("user name provided");
			lo.setpassbutton();
			log.info("password provided button clickied");
			lo.setpassword(Password);
			Thread.sleep(3000);
			log.info("password provided");
			lo.setlogin();
			Thread.sleep(3000);
			lo.setcategories();
			Thread.sleep(3000);
			lo.SetLogout();

			Thread.sleep(3000);
		}
		@DataProvider(name="Logindata")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/TestData/Logindata.xlsx";

			int rownum=XLUtils1.getRowCount(path, "Sheet1");
			int colcount=XLUtils1.getCellCount(path,"Sheet1",2);

			String logindata[][]=new String[rownum][colcount];

			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLUtils1.getCellData(path,"Sheet1", i,j);//1 0
				}

			}
			return logindata;
		}
	}


