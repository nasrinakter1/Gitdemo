package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	WebDriver driver;

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "//Users//mito//Downloads//chromedriver");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.express.com/");
		
		
		List<WebElement> ele= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div[1]/div[1]/a/img"));
		int x=ele.size();
	
		
		for(int i=1;i<=x;i++) {
			driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div/div/div/div[2]/div[2]/div/div[\\\"+i+\\\"]/div[1]/a/img")).click();
			
			
		}
	}
		
		public void expreess() {
			
			List<WebElement> option=driver.findElements(By.xpath("//*[@id=\"carousel__slide--0--0\"]/div/div[1]/div/img"));
			
			for(int i=1;i<=option.size();i++) {
				driver.findElement(By.xpath("")).click();
				
				List<WebElement> allprod =	driver.findElements(By.xpath(""));
				for(int j=1;j<=allprod.size();j++) {
					driver.findElement(By.xpath(""));
					driver.navigate().back();
					
					
					
					System.out.println("Done");
				}
			}
		}
		

		 
			}
		
		
	
	

	















