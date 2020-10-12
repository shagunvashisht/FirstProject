//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
ChromeOptions opt= new ChromeOptions();

opt.addArguments("--disable-notifications");
 WebDriver driver =new ChromeDriver(opt);
 Actions act= new Actions(driver);
 driver.get("https://www.facebook.com/");
 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rs30922@yahoo.com");
 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Deeti_13");
 
 driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Abhishek Sharma");
 //driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
// driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy']")).click();
 act.sendKeys(Keys.ENTER).perform();
 Thread.sleep(2000);
 driver.findElement(By.xpath("(//*[text()='More Options'])[1]/parent::*/parent::*/parent::*")).click();
driver.findElement(By.xpath("//span[text()='Send message']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@title='Write a message...']")).sendKeys("Hi");
driver.findElement(By.xpath("//button[text()='Send']")).click();
WebElement d=driver.findElement(By.xpath("//span[text()='Good Work My love']"));
act.moveToElement(d).perform();
//driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _55pi _2agf _4o_4 _p _4jy3 _517h _51sy' or @id='u_26_7']")).click();








//driver.findElement(By.xpath("//span[2class='_54nh']")).click();
 //Thread.sleep(5000);
/*Alert alt=driver.switchTo().alert();
System.out.println(alt.getText());
alt.accept();*/
//Alert alt=driver.switchTo().alert();
//alt.accept();
	}

}
