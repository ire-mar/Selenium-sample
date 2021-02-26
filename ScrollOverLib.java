package library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOverLib extends BaseClass
{
	public static void ScrollOverPage(WebDriver driver) throws Exception
	{
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	
js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(5000);
}
}