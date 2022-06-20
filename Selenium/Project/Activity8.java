package TestNGPAckage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	
	WebDriver driver = new FirefoxDriver();
	String x = "OrangeHRM";
@AfterMethod
	
	public void after()
	{
		driver.close();
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
      
      WebElement Appleave = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img"));
      Appleave.click();
      
      WebElement ltype = driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]"));
      ltype.click();
      Select ltypev = new Select(ltype);
  	      //List<WebElement> options = ltypev.getOptions();
  	  ltypev.selectByIndex(1);
  	  
  	  
  	  WebElement fdate = driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]"));
  	  fdate.click();
  	  fdate.sendKeys("2022-12-07");
  	  fdate.sendKeys(Keys.ENTER);

  	WebElement tdate = driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]"));
	  tdate.sendKeys(Keys.DELETE);
	  tdate.sendKeys("2022-12-25");
	  tdate.sendKeys(Keys.ENTER);
	  
	  WebElement daytype = driver.findElement(By.xpath("//*[@id=\"applyleave_duration_duration\"]"));
	  daytype.click();
	  daytype.sendKeys("Full Days");
	  daytype.sendKeys(Keys.ENTER);
	  
	  
                 
	
        
	 WebElement comment1 = driver.findElement(By.id("applyleave_txtComment"));
	
	  
	  comment1.click();
	  comment1.sendKeys("Azeema Comment 1");
	  comment1.sendKeys(Keys.ENTER);
                
  
  WebElement savebutton1 = driver.findElement(By.xpath("//*[@id=\"applyBtn\"]"));
  
  savebutton1.click();
  
  }

        
  }
  

	  
	  
	  

