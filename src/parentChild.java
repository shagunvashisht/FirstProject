import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("dog");
		//driver.findElement(By.xpath("//div[@class='a4bIc']/style/div/input")).sendKeys("dog");
		//driver.findElement(By.xpath("//div[@class='gb_h gb_i']/following-sibling::div")).click();//following sibling
		//driver.findElement(By.xpath("//a[text()='Advertising']/following-sibling::a[3]")).click();//following-sibling::tagname
		driver.findElement(By.xpath("//a[text()='Advertising']/parent::span")).click();//child to parent
		
		//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("dog");
		//driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("dog");
		//driver.findElement(By.xpath("//div[@class='gb_de gb_i gb_Cg gb_tg']/div[2]/a")).click();
	}//parent-child

}
