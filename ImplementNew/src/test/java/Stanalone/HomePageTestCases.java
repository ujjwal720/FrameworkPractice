package Stanalone;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
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
import DatProviders.SearchArea;

@Listeners(Stanalone.FailedTeseCaesListiners.class)
public class HomePageTestCases extends TestBase {
	public static WebDriver driver;

	@Test(priority = 1)
	public void firstTest() throws IOException {

		FileInputStream er = new FileInputStream(
				"C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\src\\main\\java\\TestProperties\\Authentication.Properties");
		Properties fg = new Properties();
		fg.load(er);
		String opl = fg.getProperty("url");
		System.out.println(opl);
		driver.get("http://www.automationpractice.pl/index.php");
		HomePage rt = new HomePage(driver);
		rt.searchData();
		Logger ac = Logger.getLogger("HomePageTestCases");
		PropertyConfigurator.configure("C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\log4j.properties");
		ac.info("Browser website is open");
		Assert.assertEquals("man", "van");

		/*
		 * boolean rui=rt.Blog(); rt.Tshirt();
		 */

	}

	@BeforeSuite
	public void setUp() {

		driver = setup();
		FailedTeseCaesListiners io = new FailedTeseCaesListiners(driver);
	}

	@Test(priority = 2,dataProviderClass=DatProviders.SearchArea.class,dataProvider="searcharea",singleThreaded=true)
	public void secondTest(String s) {

		driver.get("http://www.automationpractice.pl/index.php");
		String k=s;
		HomePage rt = new HomePage(driver);
		rt.searchDataExcel(s);
		Assert.assertEquals(s, k);

		

	}

}
