package DrawMyNameTest;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawMeNameTestClass {
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
	driver.get("https://www.youidraw.com/apps/painter/");
	
	WebElement canvas = driver.findElement(By.xpath("//*[@id=\"catch\"]"));
	canvas.getLocation();
	
	Actions action =new Actions(driver);
	
	
	
	action.moveByOffset(550,250).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 60).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 20).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, -40).release().perform();
	action.moveByOffset(40,0).perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, -40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(80,-80).perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 80).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, -80).release().perform();

	
	action.moveByOffset(100,40).perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, -40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();

	action.moveByOffset(80,-40).perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, -40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(-40, 0).release().perform();
	action.moveByOffset(0,0).clickAndHold().moveByOffset(0, 40).release().perform();






	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}