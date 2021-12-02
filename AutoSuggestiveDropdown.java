package MavenProject1.MavenProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLR\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id='autosuggest'][@class='inputs ui-autocomplete-input']")).sendKeys("ind");
		Thread.sleep(3000);
		//get all the options
		List<WebElement> options = driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		driver.close();
		

	}

}
