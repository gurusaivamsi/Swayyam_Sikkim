package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;
import Utilities.ReadingData;
//import freemarker.log.Logger;


public class BaseClass {
	ReadingData rd=new ReadingData();
	public String url=rd.getapplicationurl();
	public String email=rd.getemail();
	public String password=rd.getpassword();
	public static Logger log;
	public static WebDriver driver;
	
   
	@BeforeClass
	public void openapplication(){
		log=Logger.getLogger("Swayyam_Sikkim");
		PropertyConfigurator.configure("./test-output/log4j.properties");

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		//driver.get(url);
      driver.manage().window().maximize();
	}
	@AfterClass

	public void Closepage()
	{
		driver.close();
	}

	public void captureScreenshot(WebDriver driver,String name) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;//initialization
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshot/"+name+ ".png");


		FileUtils.copyFile(src, target);
		log.info("screenshot is taken");
	}
}





