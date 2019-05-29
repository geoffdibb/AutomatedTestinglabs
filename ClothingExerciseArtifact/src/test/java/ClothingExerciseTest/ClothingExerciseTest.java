package ClothingExerciseTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClothingExerciseTest {
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
	driver.get("http://automationpractice.com/index.php");
	WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
	searchbar.sendKeys("Dress");
searchbar.submit();

	WebElement dressComponentlocate = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));

	Actions action =new Actions(driver);
	action.moveToElement(dressComponentlocate).perform();
WebElement dressComponent = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
dressComponent.click();


WebElement locateWait = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span\r\n"))));

//assertTrue(dressComponent.isDisplayed());

WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span\r\n"));

viewcart.click();

WebElement procedethroughcart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span\r\n"));
procedethroughcart.click();

WebElement emailregister = driver.findElement(By.xpath("//*[@id=\"email\"]"));
emailregister.sendKeys("testmail@testtest.com");
WebElement emailregisterbutton = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
emailregisterbutton.sendKeys("password");

WebElement enterdetails = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span\r\n"));
enterdetails.click();

WebElement returnToCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
returnToCart.click();

WebElement continuepurchase = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span\r\n"));
continuepurchase.click();

//*[@id="center_column"]/form/p/button/span
WebElement continuepurchase2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span\r\n"));
continuepurchase2.click();
//*[@id="form"]/p/button/span
//*[@id="cgv"]
WebElement continuepurchasedetailconfirm = driver.findElement(By.xpath("//*[@id=\"cgv\"]\r\n"));
continuepurchasedetailconfirm.click();
WebElement continuepurchase3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span\r\n"));
continuepurchase3.click();

//*[@id="HOOK_PAYMENT"]/div[2]/div/p/a
WebElement continuepurchase4 = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a\r\n"));
continuepurchase4.click();

//*[@id="cart_navigation"]/button/span
WebElement continuepurchase5 = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span\r\n"));
continuepurchase5.click();

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}