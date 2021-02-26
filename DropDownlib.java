package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownlib
{

	public static void selectByVisibleText(WebDriver driver, WebElement element,String text)
	{
		Select date = new Select(element);
		date.selectByVisibleText(text);
	}
}
