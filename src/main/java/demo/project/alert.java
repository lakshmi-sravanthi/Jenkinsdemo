package demo.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satee\\Downloads\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	     driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
         driver.switchTo().alert().accept();
	}

}
