import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Calendar {

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
		 driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--selected")).click();//date selected
		 //System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")));
		
		 //two-way
		 driver.findElement(By.xpath("//li[@data-cy='roundTrip']//span[@class='tabsCircle appendRight5']")).click();

		 
		// When isEnabled doesn't work then  use get attribute
	//	 System.out.println(driver.findElement(By.xpath("//li[@data-cy='roundTrip']//span[@class='tabsCircle appendRight5']")).isEnabled());
		 System.out.println(driver.findElement(By.cssSelector(".lbl_input.latoBold.appendBottom10")).getAttribute("data-cy"));
	/*	if(driver.findElement(By.cssSelector(".class=fsw_inputBox.dates.reDates.inactiveWidget")).getAttribute("class").contains("return")) {
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("nope");
		//	Assert.assertTrue(false);
		}*/
		}
	}

