package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ResuableMethods {

	public boolean isDisplayed(WebDriver driver, WebElement r) {

		boolean result1 = false;

		try {

			result1 = r.isDisplayed();

			return result1;

		}

		catch (Exception e) {

			System.out.println(e);

			return result1;

		}

		finally {

			if (result1 == true) {

				System.out.println("The following element is clciked");

			}

			else {

				System.out.println("The following element is not clicked");

			}

		}

	}

	public void ClickMethod(WebElement i) {

		try {

			i.click();

		}

		catch (Exception e) {

			System.out.println(e);

		}
	}

	public boolean SelectByValue(String s, WebElement i) {

		boolean flag = false;

		Select sec = new Select(i);

		try {

			sec.selectByValue(s);

			flag = true;

			return flag;

		}

		catch (Exception e) {

			return flag;

		}

		finally {

			if (flag == true) {

				System.out.println("The following video is elcted");

			}

			else {

				System.out.println("The following viddeo is not selected");

			}

		}

	}

	/*
	 * will create the exceptio next if i understna dthis
	 */

	public void mousehover(WebDriver driver, WebElement ele) {

		try {

			Actions op = new Actions(driver);

			op.moveToElement(ele).build().perform();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void sendKey(WebElement r, String s) {

		r.sendKeys(s);

	}

	public List<WebElement> getallOptions(WebElement m) {

		Select a_m = new Select(m);

		List<WebElement> u = a_m.getOptions();

		try {

			return u;

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		return u;

	}

	public String gettext(WebElement i) {
		
		String j="";

		try {

			 j = i.getText();

			return j;

		}

		catch (Exception e) {

		}
		
		return j;
		
		
		

	}
	
	
	

}
