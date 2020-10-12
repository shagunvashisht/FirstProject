import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();

		opt.addArguments("--disable-notifications");
		 WebDriver driver =new ChromeDriver(opt);
	//	Actions act= new Actions(driver);
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 driver.manage().window().maximize();
		
		 String[] itemsNeeded= {"Almonds"};





		 driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		 Thread.sleep(3000);

		 addItems(driver,itemsNeeded);

		 }

		 public static  void addItems(WebDriver driver,String[] itemsNeeded)

		 {

		 int j=0;

		 List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		 for(int i=0;i<products.size();i++)

		 {

		 //Brocolli - 1 Kg

		 //Brocolli,    1 kg

		 String[] name=products.get(i).getText().split("-");
		 System.out.println(name);
		 String formattedName=name[0].trim();
		 System.out.println(formattedName);

		 //format it to get actual vegetable name

		 //convert array into array list for easy search

		 //  check whether name you extracted is present in arrayList or not-

		 List itemsNeededList = Arrays.asList(itemsNeeded);

		 if(itemsNeededList.contains(formattedName))

		 {

		 j++;

		 //click on Add to cart

		 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		 if(j==itemsNeeded.length)

		 {

		 break;

		 }

		 }
		 }}}
		 


/*

		 int count=0;
		 List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		 //expected list
		 String name="Cucumber";
		// String[] itemsNeeded= {"Cucumber","Brocolli", "Beetroot"};
		 Thread.sleep(3000);
		 //convert array to ArrayList for easy search
		/*
		 for(int i=0;i<products.size();i++) {
				String[] name=products.get(i).getText().split("-");
				Thread.sleep(3000);
				//format to actual vegetable name
				
				 List itemsNeededList=Arrays.asList(itemsNeeded);
				if(itemsNeededList.contains(name)) {
					driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
					if(count==3) {
						break;
				}
				 }*/
				 
		 
	/*	 //for single selection
		 for(int i=0;i<products.size();i++) {
		String name1=products.get(i).getText();
		if(name1.contains(name)) {
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			break;
		}
		 }
		 
	}

}*/