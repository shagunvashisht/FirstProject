import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work_dir\\chromedriver_win32\\chromedriver.exe");
	
	
		File src = new File("E:\\Book2.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		//sheet1.getRow(0).getCell(0);
        int rowCount=sheet1.getLastRowNum();
		for(int i=0;i<=rowCount;i++) {

		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();


		String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Data from Excel " + data0 + " " + data1);
		}
		wb.close();
	}

}
