package testPkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		
		

	}

}
