package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.xpath("//button[@id='home']")).click();
		 driver.findElement(By.xpath("//h5[text()='Button']")).click();
		 Thread.sleep(2000);
		 //Find position of button (x,y)
		 WebElement Position = driver.findElement(By.xpath("//button[@id='position']"));
		 org.openqa.selenium.Point xypoint= Position.getLocation();
		 int xvalue = xypoint.getX();
		 int yvalue = xypoint.getY();
		 System.out.println("The position of xand y:"+"x value"+xvalue + "  " +"y  value" +yvalue);
		// int xvalue = xypoint.getX();
	// int yvalue = xypoint.getY();
		// System.out.println("The position of xand y:"+"x value"+xvalue + "  " +"y  value" +yvalue);
		 
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());

	}

}
