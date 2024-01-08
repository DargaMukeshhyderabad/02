import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationform {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	
		
	//by using id locator	
	driver.findElement(By.id("input-firstname")).sendKeys("Daivik");
	
	//by using name locator
	driver.findElement(By.name("lastname")).sendKeys("Darga");
	
	//by using xpath 'and' operator
	
 driver.findElement(By.xpath("//input[@type='email' and @class='form-control']")).sendKeys("daivik@gmail.com");
 
 driver.findElement(By.xpath("//input[@type='tel' and @class='form-control']")).sendKeys("123456789");
 
 driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("India@123");
 
 driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("India@123");
 
 //driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
 
  List<WebElement> list = driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input"));
  
  for(WebElement i:list)
  {
	  if(!i.isSelected())
	  {
		  i.click();
		  break;
	  }
	  
  }
  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
  
driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	}


