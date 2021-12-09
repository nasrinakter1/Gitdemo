import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "//Users//mito//Downloads//chromedriver");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.express.com/");
		driver.findElement(By.id("closeModal")).click();
		driver.findElement(By.className("_1XzZZhTTnioCA6LcNdo8mp")).getSize();
		//System.out.println(driver.findElement(By.tagName("a")).getSize());
		//WebElement headersection = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/nav/ol"));
		//System.out.println(headersection.findElements(By.tagName("a")).size());
		
		

	}

}
