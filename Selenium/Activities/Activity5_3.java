import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity5_3 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        //Find the checkbox
        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        System.out.println("The textbox is enabled: " + textbox.isEnabled());

              
        
        //Close the browser
        driver.close();

    }

}