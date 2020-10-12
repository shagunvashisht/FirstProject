import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;

public class demo {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		//to validate page title/correct url
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());//how to print page source
	//	driver.quit();
		driver.get("http://yahoo.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		//driver.close();//to close browser
		
		//to close all windows opened by selenium (child windows)
	}
}
