package TheDemoSiteTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TheDemoSiteTest {
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
	driver.get("http://thedemosite.co.uk/");
	WebElement addAUser = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
addAUser.click();

	WebElement usernameEntry = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));

	usernameEntry.sendKeys("UserName");
	WebElement passwordEntry = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
passwordEntry.sendKeys("Pass");
WebElement enterUseButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
enterUseButton.click();
WebElement navigateToLogin = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
navigateToLogin.click();

WebElement nameLoginEntry = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
nameLoginEntry.sendKeys("UserName");
WebElement passwordLoginEntry = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
passwordLoginEntry.sendKeys("Pass");
WebElement loginButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
loginButton.click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement textSuccess = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

assertEquals("**Successful Login**", textSuccess.getText());
}

}