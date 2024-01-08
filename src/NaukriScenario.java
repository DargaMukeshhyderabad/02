import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriScenario {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naukri.com/");
		
	List <WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("number of links :"+links.size());
		
		String exp="https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch";
		
		//System.out.println("number of links:"+links.get(5));
		
		for(WebElement i:links) {
			System.out.println(i.getAttribute("href"));
			
			System.out.println(i.getText());
			
			if(i.getAttribute("href").contains(exp));
			
			 System.out.println("required link is found ");
			 
			 break;
			}
		
		//driver.close();
		
		

	}

}
