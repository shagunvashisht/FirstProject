import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		driver.findElement(By.cssSelector("button.button form-button is-primary")).click();
	//driver.findElement(By.id("username")).sendKeys("a@gmail.com");
		//driver.findElement(By.name("pw")).sendKeys("a@gmail.com");
		//driver.findElement(By.cssSelector("#username")).sendKeys("45554");
		//System.out.println(driver.findElement(By.cssSelector(".di mr16")).getText());
		
		//driver.findElement(By.id("Login")).click();
		//driver.findElement(By.className("button r4 wide primary ")).click();
		
//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();;
		//driver.close();
		//driver.findElement(By.className("button r4 wide primary")).click();
	}

}
