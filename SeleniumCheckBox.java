package MavenProject1.MavenProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLR\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/radio.html";
		driver.get(url);
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//*[@type='checkbox' and @name='webform']"));
		int size = options.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			if(options.get(i).getAttribute("value").contains("checkbox2"))
			{
				System.out.println("inside the loop");
				options.get(i).click();
				System.out.println("Clicked checkbox");
				break;
			}
		}
		
		driver.close();
	}

}
