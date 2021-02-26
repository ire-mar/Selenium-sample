package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverLib
{
	public static void mouseHover(WebDriver driver, WebElement elementToHover) throws Exception
	{
		Actions actions = new Actions(driver);

		actions.moveToElement(elementToHover).build().perform();	

	}
	
	
	public static void mouseHoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) throws Exception
	{
		Actions actions = new Actions(driver);

		actions.moveToElement(elementToHover).click(elementToClick).build().perform();
//		Thread.sleep(2000);
//		actions.moveToElement(elementToClick).click().perform();

	}

	
	public static void mouseHoverBypassCookie(WebDriver driver, WebElement ClickFirstElement,WebElement ClickSecondElement)throws Exception
	{
		Actions actions = new Actions(driver);
		
		actions.moveToElement(ClickFirstElement).build().perform();
		Thread.sleep(5000);
		
		actions.moveToElement(ClickFirstElement).moveToElement(ClickSecondElement).click(ClickSecondElement).build().perform();
	}


	
}
