package MavenProject1.MavenProject;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLR\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/radio.html";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		//driver.findElement(By.id("vfb-7-1")).click();
		Assert.assertFalse(driver.findElement(By.id("vfb-7-1")).isSelected());
		driver.findElement(By.id("vfb-7-1")).click();
		System.out.println(driver.findElement(By.id("vfb-7-1")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("vfb-7-1")).isSelected());
		driver.close();
	}

}
