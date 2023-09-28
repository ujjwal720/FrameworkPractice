package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

}
