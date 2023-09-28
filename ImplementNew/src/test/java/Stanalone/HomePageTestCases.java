package Stanalone;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import PageObjects.HomePage;

public class HomePageTestCases extends TestBase {

	WebDriver driver = TestBase.setup();

	@Test
	public void firstTest() throws IOException {

		FileInputStream er = new FileInputStream(
				"C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\src\\main\\java\\TestProperties\\Authentication.Properties");
		Properties fg = new Properties();
		fg.load(er);
		String opl = fg.getProperty("url");
		System.out.println(opl);
		driver.get("http://www.automationpractice.pl/index.php");
		HomePage rt=new HomePage(driver);
		rt.searchData();
		Logger ac=Logger.getLogger("HomePageTestCases");
		PropertyConfigurator.configure("C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\log4j.properties");
		ac.info("Browser website is open");
		
		
	
		/*
		 * boolean rui=rt.Blog(); rt.Tshirt();
		 */

	}

}
