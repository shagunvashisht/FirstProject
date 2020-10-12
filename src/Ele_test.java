import java.security.KeyStoreSpi;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

public class Ele_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pu");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);

		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);

		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Del");
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		 
		 
		 
		 
	}}
	/*	 driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8']")).sendKeys("04-24-2020");
		// driver.findElement(By.xpath("//input[@id='departure']")).sendKeys("04-24-2020");
		 driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[24]")).click();
		 }}*/
	/*WebElement date=driver.findElement(By.cssSelector("div[class='DayPicker-Day']"));
	String dateVal="24 Apr 20";
	selectDateByJS(driver,date,dateVal);
	
	}
	 public static void selectDateByJS(WebDriver driver, WebElement element,String dateVal){
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('text','+dateVal+');", element);
		}}








//driver.findElement(By.xpath("//p[@class='blackText font20 code']")).click();

	



/* 	 List<WebElement> dates= driver.findElements(By.cssSelector("div[class='DayPicker-Day']"));
	 Thread.sleep(3000);
	 int count=driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).size();
	 Thread.sleep(3000);
	 for(int i=0;i<count;i++)
	 {
		String text= driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).getText();
	 if(text.equalsIgnoreCase("24")) {
		 driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).click();
	 }}*/
	// driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	// Thread.sleep(3000);

