import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 
		 //static dropdown
		/* driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
		 driver.manage().window().maximize();
	    Select s= new Select(driver.findElement(By.id("blog-cat-dropdown")));
		 s.selectByVisibleText("SEARCH");
		 Thread.sleep(4000);
		//s.selectByValue("/blog/seo/");
		// s.selectByIndex(4);*/
		
		 
		 //dropdown without select tag
		/* driver.get("https://www.goibibo.com/");
		 driver.findElement(By.xpath("//div[@id=\"pax_link_common\"]")).click();
		 System.out.println(driver.findElement(By.xpath("//div[@id=\"pax_link_common\"]")).getText()); 
		 for(int i=1;i<3;i++) {
		 driver.findElement(By.id("adultPaxPlus")).click();
		 }
		System.out.println(driver.findElement(By.xpath("//div[@id=\"pax_link_common\"]")).getText()); */
		 
		 
		 //Dynamic Dropdown
		 
		 driver.get("https://www.spicejet.com");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("PNQ");
		 Thread.sleep(4000);
		 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Del");
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])[1]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])[1]")).getText(), "April");//assert
	/*	String month="October";
	WebElement ele=driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])[1]"));
	while(true) {
		
	
	if(ele.getText().equals(month)){
		System.out.println("found");
		System.out.println(driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])[1]")).getText());
		break;
		}
	else {
		driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
	}}
	System.out.println(driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])[1]")).getText());
	*/
		
		//checkbox
		
		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());//assert
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(	driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());//assert
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
