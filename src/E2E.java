import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
		 driver.get("https://www.spicejet.com");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("PNQ");
		 Thread.sleep(4000);
		 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Del");
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();//date selected
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

			{

			System.out.println("its enabled");

			Assert.assertTrue(true);

			}

			else

			{

			Assert.assertTrue(false);

			}


		 driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		 
		 driver.findElement(By.id("divpaxinfo")).click();
Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
s.selectByValue("2");
Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
s1.selectByValue("3");
Select s3=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
s3.selectByValue("INR");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
	}

}
