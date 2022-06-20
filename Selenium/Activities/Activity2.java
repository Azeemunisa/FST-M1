	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class Activity2 {

			public static void main(String[] args) {
			
			        //Create a new instance of the Firefox driver
			        WebDriver driver = new FirefoxDriver();

			        //Open the browser
			        driver.get("https://www.training-support.net/");
			        
			        
			        String title = driver.getTitle();
			        System.out.println("Title of the web page is: " + title);
			        
			        WebElement idLocator = driver.findElement(By.id("about-link"));
			        System.out.println("Text in element located using id: " + idLocator.getText());
			        
			        WebElement classNameLocator = driver.findElement(By.className("green"));
			        System.out.println("Text in element located using class: " + classNameLocator.getText());
			      //Find the About Us link using cssSelector()
			        
			        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
			        System.out.println("Text in element: " + cssLocator.getText());
			        
			        //Find the About Us link using linkText()
			        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
			        System.out.println("Text in element: " + linkTextLocator.getText());
			        
			        
			       driver.close();
			    }
			}

