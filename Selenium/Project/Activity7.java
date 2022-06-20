package TestNGPAckage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	
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
      
      WebElement dirbutton = driver.findElement(By.id("menu_directory_viewDirectory"));
      dirbutton.click();
      
      
      System.out.println(dirbutton.getText());
      
      WebElement myinfo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[6]/a/b"));
      myinfo.click();
      
      WebElement qual = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a"));
      qual.click();
      
      WebElement addqual = driver.findElement(By.id("addWorkExperience"));
      addqual.click();
      
      WebElement addemployer = driver.findElement(By.id("experience_employer"));
      addemployer.sendKeys("IBM Pvt Ltd");
      
      WebElement addjobtitle = driver.findElement(By.id("experience_jobtitle"));
      addjobtitle.sendKeys("Systems Engineer");
      
      WebElement Savebutton = driver.findElement(By.id("btnWorkExpSave"));
      Savebutton.click();
          
          
                 
          
                    
                }
      
           
        
  }
  

	  
  
	  
	  

