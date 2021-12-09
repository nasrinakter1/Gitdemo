import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDrown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//mito//Downloads//chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		//int i=1;
		//while(1<5) {
		//	driver.findElement(By.id("hrefIncAdt")).click();	
			//i++;
		for(int i=1; 1<5; i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
	
	}
		

	
		//driver.findElement(By.id(null))
		
		//driver.findElement(By.id("btnclosepaxoption")).click();

		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	
   }
	
	
}


	
	









