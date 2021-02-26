package mouseHoverLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.BaseClass;
import library.MouseHoverLib;

public class MouseHoverTest extends BaseClass
{

	@Test
	public void mouseHoverTest() throws Exception
	{

		driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java");

		MouseHoverLib.mouseHoverAndClick(driver, driver.findElement(By.xpath("//a[text()='Automation']")),driver.findElement(By.xpath("//a[text()='Selenium Tutorial']")));

	}

}
