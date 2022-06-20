package TestNGPAckage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver = new FirefoxDriver();
	String x = "OrangeHRM";
@AfterMethod
	
	public void after()
	{
		//driver.close();
	}
	@BeforeMethod
	
	public void before()
	{
		
		 

	        //And now use this to visit the website
	        driver.get("http://alchemy.hguy.co/orangehrm");

	}
	
	
  @Test
  public void f() {
	  
	  
	       
      WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
      username.sendKeys("orange");
      WebElement passwrd = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
      passwrd.sendKeys("orangepassword123");
      
     
 
           
      WebElement submit = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
      submit.click();
      
      WebElement Infotab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b"));
      Infotab.click();
      Infotab.click();
      
      System.out.println(Infotab.getText());
      
           
      System.out.println("Info button clicked");
          		  
    		    
      
      WebElement editButton = driver.findElement(By.id("btnSave"));
      
            
      
      editButton.click();
      
      
          
      WebElement fname = driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]"));
    
      fname.sendKeys("Jacob");
      
      WebElement lname = driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]"));
      lname.sendKeys("khanna");
      
      WebElement empid = driver.findElement(By.xpath("//*[@id=\"personal_txtEmployeeId\"]"));
      empid.sendKeys("EMP1001");
      
      WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[1]/ul/li[1]/label"));
      gender.click();
      
      WebElement DOB = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[3]/li[4]/img"));
      DOB.click();
      
      WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/div"));
  	  Select select2 = new Select(dropdown);
  	  select2.selectByValue("Aug");
            
      
      
      WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/select[2]"));
  	  Select select1 = new Select(dropdown2);
  	  select1.selectByValue("1980");
  	  
      
    
      
      
      WebElement Savebutton  = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
      Savebutton.click();
      
    
      
    
  }
  

	  
  }
	  
	  

