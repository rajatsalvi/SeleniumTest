package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ambujatest {

	public static void main(String args[]) throws InterruptedException, Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemant\\Downloads\\New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File sour = ts.getScreenshotAs(OutputType.FILE);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://customer.ambujacement.com");
		
		sour = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium1.png"));
		
		Thread.sleep(8000);
		
		
		driver.findElement(By.id("userName")).sendKeys("ashish_tpv");
		sour = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium2.png"));
		
		driver.findElement(By.id("userPassword")).sendKeys("Test123#");
		sour = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium3.png"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/my-app/ng-component/div/div[2]/div[2]/div/form/ul/li[3]/button[1]")).click();
		
		Thread.sleep(5000);
		
	
			if(driver.findElement(By.xpath("/html/body/my-app/menubar/p-dialog[3]/div")).isDisplayed() )                                                                                                         
			{         
				Thread.sleep(3000);
			  /**Do this*/     
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium4.png"));
				
				
				driver.findElement(By.xpath("/html/body/my-app/menubar/p-dialog[3]/div/div[2]/div/div/button[2]")).click();
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium5.png"));
				
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/a/span/i")).click();
				
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium6.png"));
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/ul/li[3]/a")).click();
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium7.png"));
				
			}    
			else    
			{     
			  /**Do this*/   
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium4.png"));
				
				driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/a/span/i")).click();
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium5.png"));
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/ul/li[3]/a")).click();
				
				sour = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sour, new File("C:\\SeleniumScreenshot/Selenium6.png"));
				
			}
			
			
			
			
			
			
			System.out.println("Screenshot Taken");
		
		
		
	}
}
