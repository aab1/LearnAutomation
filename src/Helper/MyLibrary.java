package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyLibrary {
	static WebDriver driver;
	static
	{
		driver = null;
		
	}
	
	
	public static void scrollToAnElement(WebElement element) throws Exception
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
	}

	public static void scrollToElement()throws Exception
	{
		// Create instance of Javascript executor

		JavascriptExecutor je = (JavascriptExecutor) driver;



		//Identify the WebElement which will appear after scrolling down

		WebElement element = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/p[14]"));
		

		// now execute query which actually will scroll until that element is not appeared on page.

		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
