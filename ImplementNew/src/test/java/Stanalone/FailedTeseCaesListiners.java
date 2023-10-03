package Stanalone;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestNG;



public class FailedTeseCaesListiners  implements ITestListener   {

public static WebDriver driver;
	
	
	
	public FailedTeseCaesListiners() {
	    // Default constructor with no parameters
		
	
	}

	public FailedTeseCaesListiners(WebDriver driver) {

		FailedTeseCaesListiners.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {

		if (driver != null) {
		    // Capture a screenshot when the test fails.
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			try {
			    // Get the test case name.
			    String testCaseName = result.getName();

			    // Generate a timestamp with date, time, and seconds.
			    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
			    String timestamp = dateFormat.format(new Date());

			    // Set the project directory to the specified path.
			    String projectDirectory = "C:\\Users\\DELL\\git\\FrameworkPractice\\ImplementNew\\";

			    // Concatenate the test case name with the timestamp.
			    String screenshotFileName = testCaseName + "_" + timestamp + ".png";
			    String screenshotPath = projectDirectory + "screenshots\\" + screenshotFileName;

			    // Create the directory to store the screenshots if it doesn't exist.
			    File directory = new File(screenshotPath).getParentFile();

			    if (!directory.exists()) {
			        boolean created = directory.mkdirs(); // Create the directory if it doesn't exist.
			        System.out.println("Directory created: " + created); // Debug statement
			    }

			    // Save the screenshot with the new filename.
			    File destFile = new File(screenshotPath);
			    FileUtils.copyFile(screenshotFile, destFile);
			    System.out.println("projectDirectory: " + projectDirectory); // Debug statement
			    System.out.println("screenshotPath: " + screenshotPath);       // Debug statement
			} catch (IOException e) {
			    e.printStackTrace();
			}
		    
		} else {
		    System.out.println("WebDriver is null");
		}

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
