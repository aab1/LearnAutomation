

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.MyLibrary;



public class TestScroll extends MyLibrary{

	
	
	
		@Test
		public void scrolling() throws Exception
		{
			WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
			driver = new ChromeDriver();
			 driver.manage().window().maximize();



			// Pass application URL

			driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

			

			// Create instance of Javascript executor

			JavascriptExecutor je = (JavascriptExecutor) driver;



			//Identify the WebElement which will appear after scrolling down

			WebElement element = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/p[14]"));
			

			// now execute query which actually will scroll until that element is not appeared on page.

			je.executeScript("arguments[0].scrollIntoView(true);",element);
			
			
			



			// Extract the text and verify

			System.out.println(element.getText());


		}
		@Test
		public void anotherScroll() throws Exception{
			WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
			
			//This is another method to 
			WebElement element = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/p[14]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
			
			
		}
}