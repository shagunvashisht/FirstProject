import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 Actions act= new Actions(driver);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // readable //applied globally to all
 // how to enter string using capital letters and to select that (composite action)
	
			act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			//moves to specific ele and right click on that
			 act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();//build action means step before is ready to execute and to execute we use perform
				
	}

}
