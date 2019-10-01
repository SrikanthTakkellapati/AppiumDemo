package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends Baseclass{
	
	@Test(testName="first-test",priority=1)
	public void testOne(){
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tesing");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Sample test 1 is done");
	}

}
