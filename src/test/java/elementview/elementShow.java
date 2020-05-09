package elementview;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementShow {
	WebDriver driver;
	@Test
	public void difElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://objectspy.space");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.linkText("Link Test : New Page")).click();
		//driver.findElement(By.partialLinkText("OS-API Product ")).click();
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Hari");
		
		//driver.findElement(By.xpath("//input[@ class='search']"));
		//driver.findElement(By.xpath("//a[@title='Automation Practice Form']"));
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : New Page')]"));
		
		
		
		
		Thread.sleep(5000);
		
		
	}
		@After
		public void diel2() {
			driver.close();
			driver.quit();	
		}
	
}

