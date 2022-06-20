package TestNGPAckage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
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
      
      WebElement element2 = driver.findElement(By.id("menu_directory_viewDirectory"));
      if (element2.isDisplayed() && element2.isEnabled()) {
          element2.click();
          System.out.println("Directory button is enabled and clickable and clicked");
          
          
                 
          
          WebElement headingtitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/a"));
          String m = headingtitle.getText(); 
          String x = "Search Directory";
         
          System.out.println("Page heading title is: " + m);
          
          
          Assert.assertEquals(m,x);
          System.out.println("Value of x is "+ x);
          
                }
      
           
        
  }
  

	  
  }
	  
	  

