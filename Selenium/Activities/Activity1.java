import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		        //Create a new instance of the Firefox driver
		        WebDriver driver = new FirefoxDriver();

		        //Open the browser
		        driver.get("https://www.yahoo.com");
		        
		        //Perform testing and assertions
		        //Close the browser
		        String title = driver.getTitle();
		        System.out.println("Title of the web page is: " + title);
		       driver.close();
		    }
		}

	

