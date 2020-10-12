import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class switchWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids=driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String parent =it.next();
	String child =it.next();
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	
		
	}

}
