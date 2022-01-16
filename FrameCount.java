package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leafground.com/pages/frame.html");
		  List<WebElement> fra = driver.findElements(By.tagName("iframe"));
		  int siz = fra.size();
		  System.out.println("Number of Frames in the Page is:" + " " +siz);
	}

}
