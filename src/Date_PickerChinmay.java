import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Date_PickerChinmay {

	public static void main(String[] args) throws ParseException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wd = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath("//*[text()='Round Trip']")).click();
		wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-cy='fromCity']"))).click();
		act.moveToElement(
				wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='From']"))))
				.sendKeys("PNQ").perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).build().perform();
		// act.moveToElement(driver.findElement(By.xpath("//input[@placeholder='To']"))).sendKeys("bangalore").sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).build().perform();
		// js.executeScript("arguments[0].value='BLR';", );
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BLR");
		Thread.sleep(3000);
		act.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER, Keys.TAB)).build().perform();

		String fromDate1 = "04/25/2020", toDate1 = "08/27/2020";
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("EE MMM dd yyyy");
		Date date1 = format1.parse(fromDate1), date2 = format1.parse(toDate1);
		String fromDate = format2.format(date1).toString();
		String toDate = format2.format(date2).toString();
		System.out.println(fromDate);
		System.out.println(toDate);
		int i = 0;
		outer: while (i < 20) {

			List<WebElement> label1 = driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));

			for (WebElement s1 : label1) {
				//System.out.println(s1.getAttribute("aria-label"));
				if (s1.getAttribute("aria-label").equalsIgnoreCase(fromDate)) {
					s1.click();
					break;
				}
			}

			for (WebElement s1 : label1) {
				//System.out.println(s1.getAttribute("aria-label"));
				if (s1.getAttribute("aria-label").equalsIgnoreCase(toDate)) {
					s1.click();
					break outer;
				}
			}
			driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
			i++;
		}
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		// driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"(//span[contains(.,'Departure From')])[1]/parent::*//following-sibling::span[contains(.,'12 Noon-')]"))
				.click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath(
				"(//span[contains(.,'Departure From')])[2]/parent::*//following-sibling::span[contains(.,' 6AM')]")))
				.click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Book Now']")).click();
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Continue']"))).click();
		}
		catch(Exception e) {
			
		}
		for (String s : driver.getWindowHandles()) {
			driver.switchTo().window(s);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Enter Coupon Code']"))).sendKeys("Test");

	

	}

}
