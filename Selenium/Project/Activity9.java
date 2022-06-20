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

public class Activity9 {
	
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
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
      
      WebElement MyInfo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b "));
      MyInfo.click();
      MyInfo.click();
      
            
      WebElement emcontact = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a"));
      emcontact.click();
      
      
      
      
      List<WebElement> empname = driver.findElements(By.className("empContactName"));
    
      List<WebElement> emrelationship = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/thead/tr/th[3]"));
      
      List<WebElement> emrphone = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/table/thead/tr/th[5]"));      
      
      for (int column = 0; column < empname.size(); column++) {
	        // To retrieve text from that specific cell.
	        String celtext = empname.get(column).getText();
	        System.out.println("Emp Name " + celtext);
	        
	        String celtext2 = emrelationship.get(column).getText();
	        System.out.println("Emp Relationship " + celtext2);
	        
	        String celtext3 = emrphone.get(column).getText();
	        System.out.println("Emp Phone " + celtext3);
  }
      

        
  }
}
  
	  
	  

