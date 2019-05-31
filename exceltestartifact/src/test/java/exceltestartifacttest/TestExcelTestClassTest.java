package exceltestartifacttest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import exceltestartifactmain.Constant;

public class TestExcelTestClassTest {
	static WebDriver driver;

	// @Test
	// public void WriteToExcel(){
	//
	// FileInputStream file = null;
	// try {
	// file = new FileInputStream (Constant.PATHTOFILE + Constant.FILETESTDATA);
	//
	// } catch (FileNotFoundException e) {}
	// XSSFWorkbook workbook = null;
	// try {
	// workbook = new XSSFWorkbook(file);
	// } catch (IOException e) {}
	// XSSFSheet sheet = workbook.getSheetAt(0);
	// XSSFCell cell = sheet.getRow(1).getCell(0);
	// XSSFCell cellpass = sheet.getRow(1).getCell(1);
	// System.out.println(cell.getStringCellValue());
	// System.out.println(cellpass.getStringCellValue());
	//
	//// String temp=cell.getStringCellValue()+cellpass.getStringCellValue();
	// XSSFCell cell3 = sheet.getRow(1).createCell(2);
	// // cell3.setCellValue("Login Succesful");
	//
	//
	// try {
	// FileOutputStream out = new FileOutputStream( new File(
	// Constant.PATHTOFILE + Constant.FILETESTDATA));
	// workbook.write(out);
	// out.close();
	// System.out.println("File Saves");
	// } catch (IOException e) {
	// System.out.println("e printStackTrace");
	// }
	//
	//
	// }
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
		FileInputStream file = null;
		try {
			file = new FileInputStream(Constant.PATHTOFILE + Constant.FILETESTDATA);

		} catch (FileNotFoundException e) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
		}
		for (int i = 1; i <= 4; i++) {

			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFCell cell = sheet.getRow(i).getCell(0);
			XSSFCell cellpass = sheet.getRow(i).getCell(1);
			System.out.println(cell.getStringCellValue());
			System.out.println(cellpass.getStringCellValue());

			String temp = cell.getStringCellValue() + cellpass.getStringCellValue();
			XSSFCell cell3 = sheet.getRow(i).createCell(2);

			String username = cell.getStringCellValue();
			String password = cellpass.getStringCellValue();

			driver.manage().window().maximize();
			driver.get("http://thedemosite.co.uk/");
			WebElement addAUser = driver.findElement(By
					.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
			addAUser.click();

			WebElement usernameEntry = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));

			usernameEntry.sendKeys(username);
			WebElement passwordEntry = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
			passwordEntry.sendKeys(password);
			WebElement enterUseButton = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
			enterUseButton.click();
			WebElement navigateToLogin = driver.findElement(By
					.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
			navigateToLogin.click();

			WebElement nameLoginEntry = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
			nameLoginEntry.sendKeys(username);
			WebElement passwordLoginEntry = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
			passwordLoginEntry.sendKeys(password);
			WebElement loginButton = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
			loginButton.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			WebElement textSuccess = driver
					.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

			assertEquals("**Successful Login**", textSuccess.getText());
			cell3.setCellValue("Login Succesful");

			try {
				FileOutputStream out = new FileOutputStream(new File(Constant.PATHTOFILE + Constant.FILETESTDATA));
				workbook.write(out);
				out.close();
				System.out.println("File Saves");
			} catch (IOException e) {
				System.out.println("e printStackTrace");
			}

		}
	}
}
