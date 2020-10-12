import java.security.KeyStoreSpi;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

public class date_picker{
	
	 

	public static void main(String[] args) throws InterruptedException {
		 String month="October 2020";
		 String day="24";

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pu");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);

		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);

		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Del");
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		
		 driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		 
		WebElement mon1=driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8']"));
		System.out.println(mon1.getText());
		WebElement mon=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		System.out.println(mon.getText());
		while(true) {
		 
			if(mon.getText().equals(month))
			{
				System.out.println("found");
				break;
		}
			else {
					driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
					
			}}
				System.out.println(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText());
		
				List<WebElement> date1= driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
				
					for(int i=0;i<date1.size();i++) {
							
						String Date_picked=date1.get(i).getText();
					if(Date_picked.equals(day)) {
						driver.findElement(By.xpath("//div[@class='dateInnerCell']")).click();
					}
					}} 
}
				//String DATE=date1.getAttribute(DATE).toString();
			/*
				{
					driver.findElement(By.xpath("//div[@class='dateInnerCell']")).click();
				System.out.println("tadaa");
						}
				}*/
			
	