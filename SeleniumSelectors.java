package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumSelectors {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLR\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(100);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement name = driver.findElement(By.id("inputUsername"));
		WebElement password = driver.findElement(By.name("inputPassword"));
		name.sendKeys("Bhavani");
		password.sendKeys("bhav1234");
		//driver.findElement(By.xpath("//*[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.className("error")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Name']")).sendKeys("Bhavani");
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Email']")).sendKeys("bhav@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Phone Number']")).sendKeys("6673536182");
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Username']")).sendKeys("Bhavani");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@id='chkboxTwo'][@name='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.close();
		
	}

}
