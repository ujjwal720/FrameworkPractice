package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

	WebDriver driver;

	public HomePage() {

		//this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='search_query form-control ac_input']")
	WebElement search;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]")
	WebElement women;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]")
	WebElement Dress;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]")
	WebElement Tshirt;

	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[4]")
	WebElement Blog;
	
	
	ResuableMethods p=new ResuableMethods();
	

	public void search(String s) {

		search.sendKeys(s);

	}

	public void women() {

		women.click();

	}

	public boolean Dress() {

		return p.isDisplayed(driver, Dress);

	}
	
	
	public void Tshirt() {

		p.ClickMethod(Tshirt);

	}
	
	public boolean Blog() {
		
		boolean x=search.isDisplayed();

		return x;

	}


}
