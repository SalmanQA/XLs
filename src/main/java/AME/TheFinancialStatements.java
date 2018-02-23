package AME;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class TheFinancialStatements extends Registration {
     
	 public WebDriver driver;

  @Test
     public void main() throws InterruptedException {

	  //Find the element that's ID attribute is 'account'(My Account)
      driver.findElement(By.id("username")).sendKeys("ame");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Find the element that's ID attribute is 'log' (Username)
      driver.findElement(By.id("password")).sendKeys("ame");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Find the element that's ID attribute is 'pwd' (Password)
      driver.findElement(By.id("loginbtn")).click();

      // Now wait for Tutorial to be opened
      Thread.sleep(3000);
     
      //Click on Tutorial 'The Financial Statements'
      
        Registration obj = new Registration();
        obj.get(driver);
  

        driver.switchTo().window("Popup");
        driver.manage().window().maximize();

      
      // Perform the actions on new window
 
        String currentUrl = driver.getCurrentUrl();
        //Print the current URL.
        System.out.println(currentUrl);

        ///Perform operation on new opened window
        TimeUnit.MINUTES.sleep(5);
        driver.switchTo().frame("scorm_object");
        //click on menu
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"menu\"]")).click();
        //click on Link
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"pdf\"]")).click();
        //Click on Calculator
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"calc\"]")).click();
        //click on Script
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"crdr\"]")).click();
        //click on caption closed
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"cc\"]")).click();
        //click on Bookmarks
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bookmark\"]")).click();
        //click on volume
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]")).click();
        //click on sound +/-
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"sound\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/nav/div[1]/div[9]/div")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on play
        driver.findElement(By.xpath("//*[@id=\"playpause\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on pause
        driver.findElement(By.xpath("//*[@id=\"playpause\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on replay
        driver.findElement(By.xpath("//*[@id=\"replay\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     //click on Next
    
     driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
     int i;
         for(i=0;i<=12;i++)
     {
     WebDriverWait wait = new WebDriverWait(driver, 60*15);
     wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@class='clProg']"), "100%"));
    
     driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
     }
  }
  
  @BeforeMethod

  public void beforeMethod() {
	  
	  //Create a new instance of the Firefox driver
      driver = new FirefoxDriver();
      //Put a Implicit wait,this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Launch the Website
      driver.get("http://www.ameengage.com/course/view.php?id=3551");

    

      

     

      

      
      

      }
  

  @AfterMethod

  public void afterMethod() {
     
	  // Close the driver
      


  }

}