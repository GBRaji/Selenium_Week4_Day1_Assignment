package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leafground.com/pages/frame.html");
		  driver.switchTo().frame(0);
		  WebElement but = driver.findElement(By.xpath("//button[@id='Click']"));
		  File source = but.getScreenshotAs(OutputType.FILE);
			File destination = new File ("./images/clickbutton.png");
			FileUtils.copyFile(source, destination);
	}

}
