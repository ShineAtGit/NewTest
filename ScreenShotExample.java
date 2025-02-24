package testPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\shine\\Documents\\screenshot.png"));
		
		WebElement srcElement=driver.findElement(By.id("email"));
		srcElement.sendKeys("shinets89@gmail.com");
		
		File srcElemetFile=srcElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcElemetFile, new File("login.png"));
		
		System.out.println(srcElement.getRect().getDimension().getHeight());
		System.out.println(srcElement.getRect().getDimension().getWidth());
				
		
	}

}
