import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		// Actions act= new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // readable //applied globally to all

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id=start] button")).click();
	}
//withtimeout/polling/exception
	//is.displayed//customized method// xpath same two message to be printed [used there] // implement wait interface
	
}
