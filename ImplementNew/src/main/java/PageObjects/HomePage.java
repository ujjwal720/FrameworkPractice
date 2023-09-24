package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

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

	public void search(String s) {

		search.sendKeys(s);

	}

	public void women() {

		women.click();

	}

	public void Dress() {

		Dress.click();

	}
	
	
	public void Tshirt() {

		Tshirt.click();

	}
	
	public void Blog() {

		Blog.click();

	}


}
