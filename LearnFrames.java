package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
	public static void main(String[]args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("home")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String>windowHandles = driver.getWindowHandles();
		List<String>list = new ArrayList<String>(windowHandles);
		String secondWindow = list.get(1);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title is \t"+driver.getTitle());
		
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println("Title is \t"+driver.getTitle());

		
		
		


}
}
