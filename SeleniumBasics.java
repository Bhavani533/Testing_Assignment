package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLR\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
