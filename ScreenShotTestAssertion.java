package screenShotLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;
import library.BaseClass;

public class ScreenShotTestAssertion extends BaseClass
{

	

	@Test
	public void assertionTest()
	{

		driver.get("https://www.google.com");

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("Test case passed");
//	
//		}
//		
//		else
//		{
//			System.out.println("Test case failed");
//		}

		// In selenium automation no body is interested in console prints everybody
		// wants a test report
		// Test report can be achieved using TestNG

		Assert.assertEquals(actualTitle, expectedTitle);

		Utility.caoptureScreenshot(driver, "GooglePage");

		driver.findElement(By.name("q")).sendKeys("Selenium");

		Utility.caoptureScreenshot(driver, "GoogleSearchPage");

	}

}
