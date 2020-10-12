import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
		//Actions act= new Actions(driver);
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rs30922@yahoo.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Deeti_13");
		 driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		 driver.findElement(By.xpath("(//div[text()='Pages'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Stayhome StaySafe']")).click();
		 driver.manage().window().maximize();
		
			// System.out.println("hi");
		 Thread.sleep(2000);
		 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		 for(int i=1;i<=5;i++) {
	 driver.findElement(By.xpath("(//button[text()='Invite'])[1]")).click();
	// System.out.println("(//button[text()='Invite'])[\"+ i+\"]");
	 Thread.sleep(1000);
	System.out.println("sent");
		 }
		 driver.quit();
		 // 
		//  
		// }
	}

}
