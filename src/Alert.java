import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.id("name")).sendKeys("Shagun");
		 driver.findElement(By.id("alertbtn")).click();
		System.out.println( driver.switchTo().alert().getText());
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("name")).sendKeys("Shagun");
		 driver.findElement(By.id("confirmbtn")).click();
		 System.out.println( driver.switchTo().alert().getText());
		 Thread.sleep(4000);
		 driver.switchTo().alert().dismiss();
		  
		 

	}

}
