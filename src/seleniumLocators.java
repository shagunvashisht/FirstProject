import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.get("http://www.qaclickacademy.com/interview.php");
	//driver.findElement(By.xpath("//a[text()='Blog']")).click();

	//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

	//System.out.println(driver.findElement(By.xpath(".//*[@class='_5k_2 _5dba']/parent::span")).getAttribute("class"));
	//

	//driver.close();
	
	
//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("hh");
	//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("g");
	driver.findElement(By.cssSelector(".inputtext login_form_input_box")).sendKeys("v");
	//driver.findElement(By.cssSelector("#email")).sendKeys("ff@gmail.com");//customized css id
	//driver.findElement(By.cssSelector("input[type='submit']")).click();
	//driver.findElement(By.id("email")).sendKeys("a@gmail.com");
	//driver.findElement(By.name("pass")).sendKeys("a@gmail.com");
	
	//System.out.println(driver.findElement(By.xpath("//span[@id='u_0_z']/parent::div[2]")).getAttribute("hi"));
	
	//driver.findElement(By.xpath("//input[@type='submit'and @id='u_0_b']")).click();//xpath for login
	//driver.findElement(By.xpath("/")).click();
	//System.out.println(driver.findElement(By.cssSelector("div#error_box.pam._3-95.uiBoxRed")).getText());//get text
	
	//driver.findElement(By.xpath("//input[@type='submit'and @id='u_0_b']")).click();//xpath for login
	//driver.findElement(By.cssSelector("img[width='537'][height='195']"));
	//driver.findElement(By.linkText("Forgotten account?")).click();;
	//driver.close();
	//driver.quit();
	//driver.findElement(By.cssSelector("#email")).sendKeys("gg");
	//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("454543");
	//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	//driver.findElement(By.xpath(//a[text()='Forgotten account?'])).c
	}

}
