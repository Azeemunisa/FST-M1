package TestNGPAckage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	
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
      
      WebElement PIM = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"));
      PIM.click();
      
      WebElement AddButton = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
      AddButton.click();
      
      WebElement empfname = driver.findElement(By.xpath("//*[@id='firstName']"));
    
      empfname.sendKeys("Jacob");
      
      WebElement emplname = driver.findElement(By.xpath("//*[@id=\'lastName\']"));
      emplname.sendKeys("khanna");
      
      WebElement empid = driver.findElement(By.xpath("//*[@id=\"employeeId\"]"));
      empid.sendKeys("PM1008");
      
      WebElement Savebutton  = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
      Savebutton.click();
      
    
    WebElement emplist = driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
    emplist.click();
    
    WebElement S_name = driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));
    S_name.sendKeys("Jacob khanna");
    
    WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
    searchbutton.click();
  
    
    WebElement result = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]/a"));
    String s1 = result.getText();
    
    System.out.println("Search result is " + s1);
    String s2= "0584PM1008";
    
    Assert.assertEquals(s1,s2);
    
   
    
    
  }
  

	  
  }
	  
	  

