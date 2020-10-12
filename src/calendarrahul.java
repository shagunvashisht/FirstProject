import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendarrahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
	//	Actions act= new Actions(driver);
		 driver.get("https://www.path2usa.com/travel-companions");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		 //August23
		 while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")) .click();
		 }//whwen the condition false for while it comes out
		// while(true) {
			 
		 
	List<WebElement> dates=driver.findElements(By.className("day"));
	int count=driver.findElements(By.className("day")).size();
	for(int i=1;i<count;i++) {
	String current=dates.get(i).getText();
	if(current.equalsIgnoreCase("10")) {
		dates.get(i).click();
		break;
	}}
	
	//}

	}}
