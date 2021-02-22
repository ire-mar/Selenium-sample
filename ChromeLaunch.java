package selniumFirstSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Utility;

public class ChromeLaunch {

	public static void main(String[] args) {

//		String projectDirectory=System.getProperty("user.dir");
//		System.out.println(projectDirectory);
//		System.setProperty("webdriver.chrome.driver",projectDirectory+"\\chromedriver.exe");

		// much easire way to add chrome driver to project directory

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		Utility.caoptureScreenshot(driver,"GooglePage");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Utility.caoptureScreenshot(driver,"GoogleSearchPage");

	}

}
