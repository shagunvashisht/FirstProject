import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
			//1-calculate links on the page-[tagname a
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2-Count of links in footer section
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3- particular column links
	WebElement ele=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(ele.findElements(By.tagName("a")).size());
	
	//4-Click on each link in column & grab title of child pages
	for(int i=1;i<ele.findElements(By.tagName("a")).size();i++) {
	String ClickOnLink=	Keys.chord(Keys.CONTROL,Keys.ENTER);
		ele.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
		Thread.sleep(5000);}
		Set<String> abc=driver.getWindowHandles();
	Iterator<String> it	=abc.iterator();
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	}
	
	

}
