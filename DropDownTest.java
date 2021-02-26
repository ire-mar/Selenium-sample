package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import library.BaseClass;
import library.DropDownlib;

public class DropDownTest extends BaseClass
{
	
	@Test
	public void dropDownTest() throws Exception
	{
		

		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
//		Thread.sleep(3000);
		DropDownlib.selectByVisibleText(driver, driver.findElement(By.id("day")), "27");
		DropDownlib.selectByVisibleText(driver, driver.findElement(By.id("month")), "Aug");
		DropDownlib.selectByVisibleText(driver, driver.findElement(By.id("year")), "2000");

	}

}
