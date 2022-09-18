package org.fra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeBase {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.findElement(By.id("username")).sendKeys("Ranjith01007");
		driver.findElement(By.name("password")).sendKeys("Namakkal@123");
		driver.findElement(By.id("login")).click();
		WebElement allbtn = driver.findElement(By.id("location"));
		allbtn.click();
		Robot key = new Robot();
        for ( int i = 1; i<7; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("hotels")).click();
        for ( int i = 1; i<3; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("room_type")).click();
        for ( int i = 1; i<3; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("prabhu");
		driver.findElement(By.id("last_name")).sendKeys("Amirtharasu");
		driver.findElement(By.id("address")).sendKeys("trichy");
		driver.findElement(By.id("cc_num")).sendKeys("1212121212121212");
		driver.findElement(By.id("cc_type")).click();
		
        for ( int i = 1; i<3; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_exp_month")).click();
        for ( int i = 1; i<3; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_exp_year")).click();
        for ( int i = 1; i<3; i++ ) {
			
			key.keyPress(KeyEvent.VK_DOWN);
			key.keyRelease(KeyEvent.VK_DOWN);
}
		
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		String orderno = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(orderno);

	}

}
