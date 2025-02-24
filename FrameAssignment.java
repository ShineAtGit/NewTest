package testPkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		WebElement first=driver.findElement(By.cssSelector("frameset[frameborder='1']"));
		driver.switchTo().frame(0);
		System.out.println(first);
		
		String result=driver.findElement(By.xpath("//frame[@name='frame-bottom']")).getText();
		System.out.println(result);				

	}

}
