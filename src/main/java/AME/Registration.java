package AME;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Registration {
public void get(WebDriver driver) throws InterruptedException {
	

{
	System.out.println("OK PASSED");
	Thread.sleep(3000);
	WebElement tut = driver.findElement(By.xpath("//span[contains(@class, 'instancename') and text()='Tutorial: The Financial Statements']"));
    tut.click();
  
}


}}