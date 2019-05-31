package PHPTravelTest;

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

public class PHPTravvelTest {
	static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void methodTest() {
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/m-hotels");
		WebElement hotelname = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		hotelname.sendKeys("London");
		hotelname.submit();
		Actions action = new Actions(driver);

		WebElement locateWait1 = (new WebDriverWait(driver, 5)).until(ExpectedConditions
				.elementToBeClickable((By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a"))));

		WebElement nextpage = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a"));

		WebElement nextpage2 = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[4]/a"));
		nextpage2.click();

		WebElement locateWait3 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable((By.xpath(
				"//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[3]/td/div[3]/a/button"))));

		WebElement LondonHotel = driver.findElement(By
				.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[3]/td/div[3]/a/button"));
		LondonHotel.click();

		WebElement adultsSelection = driver.findElement(
				By.xpath("//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div"));
		adultsSelection.click();
		// *[@id="body-section"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input
		WebElement calender = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input\r\n"));
		calender.click();
		WebElement calenderclick = driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/tbody/tr[3]/td[4]"));
		calenderclick.click();

		WebElement locateWait4 = (new WebDriverWait(driver, 5))
				.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"ROOMS\"]/div/button"))));

		WebElement submitdeets = driver.findElement(By.xpath("//*[@id=\"ROOMS\"]/div/button"));

		submitdeets.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}