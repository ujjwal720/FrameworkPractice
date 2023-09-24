package Stanalone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTestCases extends TestBase  {

	WebDriver driver = TestBase.setup();

	
	@Test
	public void firstTest() throws IOException {

		FileInputStream er = new FileInputStream(
				"C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\src\\main\\java\\TestProperties\\Authentication.Properties");
		Properties fg = new Properties();
		fg.load(er);
		String opl=fg.getProperty("url");
		System.out.println(opl);
		driver.get("http://www.automationpractice.pl/index.php");

	}

}
