import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleItemAdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		// Actions act= new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // readable //applied globally to all
		// steps//
		// cons:hides performance issue in webapp,exceptions doesnt come*/

		/*
		 * Explicit wait: to target specific element has no effect on other steps
		 * achieved by webDriver wait 7fluent wait
		 */

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] ReqList = { "Beetroot", "Cucumber" };
		addItems(driver, ReqList);
		WebDriverWait w = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// Thread.sleep(3000);

		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		System.out.println(driver.findElement(By.xpath("//button[@class='promoBtn']")).getText());

		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.quit(); 
	}

	public static void addItems(WebDriver driver, String[] ReqList) throws InterruptedException {
		int count = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name1 = products.get(i).getText().split("-");
			String formattedName = name1[0].trim();
			// System.out.println("gi");
			List ItemNeededList = Arrays.asList(ReqList);
			if (ItemNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == ReqList.length) {
					break;
				}
			}

		}

	}
}
