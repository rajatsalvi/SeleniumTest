package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ambujatest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemant\\Downloads\\New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://customer.ambujacement.com");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("userName")).sendKeys("ashish_tpv");
		
		driver.findElement(By.id("userPassword")).sendKeys("Test123#");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/my-app/ng-component/div/div[2]/div[2]/div/form/ul/li[3]/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/a/span/i")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/my-app/menubar/div[1]/div/div[4]/div/ul/li[3]/a")).click();
		
		
		
		
		
		
	}
}
