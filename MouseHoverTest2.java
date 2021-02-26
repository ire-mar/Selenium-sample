package mouseHoverLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.BaseClass;
import library.MouseHoverLib;
import library.ScrollOverLib;

public class MouseHoverTest2 extends BaseClass
{

	@Test
	public void mouseHoverTest() throws Exception
	{

		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");

		//MouseHoverLib.mouseHoverAndClick(driver, driver.findElement(By.xpath("//span[text()='VIDEOS']")),driver.findElement(By.xpath("//span[text()='Paid Selenium Video Tutorial']")));
		//Thread.sleep(5000);
		//MouseHoverLib.mouseHoverAndClick(driver, driver.findElement(By.xpath("//span[text()='VIDEOS']")),driver.findElement(By.xpath("//span[text()='Paid Selenium Video Tutorial']")));
MouseHoverLib.mouseHoverBypassCookie(driver,driver.findElement(By.xpath("//span[text()='VIDEOS']")),driver.findElement(By.xpath("//span[text()='Paid Selenium Video Tutorial']")));
ScrollOverLib.ScrollOverPage(driver);
	
	}

}
