import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
	
	public static void main(String[] arg) {
		

		
	System.setProperty("webdriver.chrome.driver", "//Users//mito//Downloads//chromedriver");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	//System.out.println(driver.getTitle());

	//driver.close();
	
	
	//dropdown with sleect tag"
	WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(staticDropdown);
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
    dropdown.selectByVisibleText("AED");
    System.out.println(dropdown.getFirstSelectedOption());
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	

 
		
	}
}



