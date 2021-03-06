package seltestartifactTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTestClass {
	static WebDriver driver;
	

	@BeforeClass
	public static void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)/chromedriver.exe");
	 driver = new ChromeDriver();
}

@After
public void teardown() {
	driver.quit();
}

@Test
public void methodTest() {
	driver.manage().window().maximize();
	driver.get("https://www.google.co.uk");
	
	WebElement we = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
	we.sendKeys("Doggos");
	
	WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]"));
	search.click();
	

	WebElement images = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
	images.click();
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}