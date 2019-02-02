package Objectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration {

	//registration link
		
		public Registeration(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(name="firstname")
		public WebElement initialname;
		
		@FindBy(name="lastname")
		public WebElement finalname;
		
		@FindBy(name="email")
		public WebElement emailid;
		
		@FindBy(name="telephone")
		public WebElement ptcl;
		
		@FindBy(name="password")
		public WebElement pw;
		
		@FindBy(name="confirm")
		public WebElement pakka;

		
		@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
		public WebElement checkbox;
		
		@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
		public WebElement Continue;
		
		public void Register(String id, String pwd){
			
			initialname.sendKeys("asad");
			finalname.sendKeys("hashmi");
			emailid.sendKeys(id);
			ptcl.sendKeys("654654");
			pw.sendKeys(pwd);
			pakka.sendKeys(pwd);
			checkbox.click();
			Continue.click();
					
			System.out.println("Registeration Successfully");
		
		
		
		

	
//	//click for myaccountdropdown
//	WebElement MyAccount;  
//	MyAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")); //inspect element and then click inspect element on login button and copy xpath and then find it and then copy that path and paste here)
//	MyAccount.click(); 
//	
//				//registerbutton
//				WebElement Register;  
//				Register = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")); //inspect element and then click inspect element on login button and copy xpath and then find it and then copy that path and paste here)
//				Register.click();
//				
//	//fillingregistrationform
//				WebElement FirstName;
//				FirstName = driver.findElement(By.id("input-firstname"));
//				FirstName.sendKeys("Muhammad Asad");			
//				
//						WebElement LastName;
//						LastName = driver.findElement(By.id("input-lastname"));
//						LastName.sendKeys("Hashmi");	
//				
//						
//				WebElement email;
//				email = driver.findElement(By.id("input-email"));
//				email.sendKeys("random23@opencart.com");
//				
//				
//						WebElement telpehone;
//						telpehone = driver.findElement(By.id("input-telephone"));
//						telpehone.sendKeys("12312123");
//					
//				WebElement RegisterPassword;
//				RegisterPassword = driver.findElement(By.id("input-password"));
//				RegisterPassword.sendKeys("opencart12");	
//				
//				
//						WebElement ConfirmPassword;
//						ConfirmPassword = driver.findElement(By.id("input-confirm"));
//						ConfirmPassword.sendKeys("opencart12");	
//				
//						//radiobuttonYES
//						WebElement Rights;  
//						Rights = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")); //inspect element and then click inspect element on login button and copy xpath and then find it and then copy that path and paste here)
//						Rights.click();
//					
//						
//						//Continuebutton
//						WebElement Continue;  
//						Continue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")); //inspect element and then click inspect element on login button and copy xpath and then find it and then copy that path and paste here)
//						Continue.click();
						
					
						
				//endformfilling	
				
						
				//successpagebutton
//						WebElement Continue2;  
//						Continue2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")); //inspect element and then click inspect element on login button and copy xpath and then find it and then copy that path and paste here)
//						Continue2.click();
						
						
			//registrationComplete	
			
	
}
}
