package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objectclasses.LoginClass;
import Objectclasses.LogoutClass;
import Objectclasses.OrderProcess;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException, BiffException {

		
		FileInputStream fs = new FileInputStream("C:\\Users\\Selenium\\Desktop\\Third Session\\Third Session\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selenium\\Desktop\\Selenium Setup & Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		
		LoginClass log = new LoginClass(driver);
		
		for (int x=0 ; x<=3 ; x++)
		{
		log.Login(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		}	
		//for (int x=0 ; x<=3 ; x++)
		//{
		//LoginClass loginobjects = new LoginClass (driver);
		//loginobjects.Login("asad@agilosoft.com","123456789");
		
		
//		LogoutClass logout = new LogoutClass (driver);
//		logout.logout();
		
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		//}
		
		                                 
//		LoginClass loginobjects1 = new LoginClass (driver);
//		loginobjects.Login("random23@opencart.com","opencart12");
		
//		LogoutClass logout1 = new LogoutClass (driver);
//		logout.logout();
		
		
		Thread.sleep(2000);
		
		//OrderProcess processorder = new OrderProcess (driver);
		//processorder.processorder();
	
		//Thread.sleep(2000);
		
		
	
		driver.close();
		driver.quit();
		
	}

}
