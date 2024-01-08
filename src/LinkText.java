import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("onlytestingblog")).click();
		System.out.println("page title is : " +driver.getTitle());
		//driver.close();

	}

}
