import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
		Actions act= new Actions(driver);
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9872569456");
		 driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("flipthekart10");
		 driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		 Thread.sleep(5000);
		 act.moveToElement(driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"))).click().build().perform();
		 Thread.sleep(2000);
		 act.moveToElement(driver.findElement(By.xpath("//a[@title='Sarees']"))).click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();        
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Striped Fashion Cotton Linen Blend, Cotton Silk Saree']")).click();
		Thread.sleep(3000);
		for(String childTab:driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	
	}

}
