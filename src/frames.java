import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		// go to frame
		 
		 System.out.println(driver.findElements(By.tagName("iframe")).size());
		 
		 driver.switchTo().frame(0);//by index not suggested as if in future new frames are added
		// driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));//iframe[class='demo-frame'] //switching to frame by webelement
		 driver.findElement(By.id("draggable")).click();
// TODO Auto-generated method stub
		 
		 //drag and drop using action class
		 Actions a= new Actions(driver);
		 a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		 //or we can make webelement source and dest and then perform action on it

		 
		 //get back from frame component
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Accept']")).click();
	}

}
