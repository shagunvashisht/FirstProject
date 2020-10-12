import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\work_dir\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		System.out.println("Shagun Before");
		driver.get("https://in.yahoo.com/?p=us");
		System.out.println("Shagun Before");
		System.out.println("HEllo Shagun After");
//		System.out.println(driver.getTitle());
	}


	}
