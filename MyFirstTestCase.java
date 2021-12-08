package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase 
{
	WebDriver driver;
	
	@Test(description="Launching the URL",priority=0)
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Z:\\Software\\Selenium SW\\chromedriver96.exe");
		driver=new ChromeDriver();
		driver.get("https://shop.mercedes-benz.com/en-th/shop/vehicle/srp");
		Thread.sleep(15000);
		System.out.println("Welcome");
		((WebElement) driver.findElements(By.cssSelector("#cmm_bookie_banner .wb-button--accept-all"))).click();
		
		//driver.findElement(By.className("wb-button--accept-all")).click();
		//driver.switchTo().alert().accept();
	}
	
	@Test(description="Going inside of Body Type Option",priority=1)
	public void BodyType()
	{
		driver.findElement(By.xpath("//*[@assortment='vehicle']//div[2]//div[1]//div[2]//div[2]//button[1]")).click();	
		driver.findElement(By.xpath("//main//div//div[2]//div[1]//a[2]")).click();
	}
	
	@Test(description="Go into the Contact Me Option",priority=2)
	public void ContactMe()
	{
		driver.findElement(By.xpath("//*[@class='dcp-cars-buy-box__contact-seller wb-button wb-button--tertiary wb-button--small']")).click();
	}
	
	@Test(description="Try to fill all Fields",priority=3)
	public void ContactDetails()
	{
		driver.findElement(By.xpath("//*[@id='y9g0a4ehx']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//*[@id='1jhutwrih']")).sendKeys("G");
		driver.findElement(By.xpath("//*[@id='l0e2q0ocl']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("//*[@id='z99ueu2mf']")).sendKeys("8765432190");
		driver.findElement(By.xpath("//div[6]//wb-checkbox-control[1]//label[1]//wb-icon[1]")).click();
		driver.findElement(By.xpath("//div[@data-test-id='pdp']//div//div[7]//wb-checkbox-control[1]//label[1]//wb-icon[1]")).click();
	}
	
}
	
