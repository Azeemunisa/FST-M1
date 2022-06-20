package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	
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
      
      WebElement dashboard = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1"));
      String dashboardtext = dashboard.getText();
      System.out.println("Verified this section appears on homepage -> " + dashboardtext);
     
  }
  

	  
  }
	  
	  

