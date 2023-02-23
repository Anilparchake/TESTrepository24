package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	
public static void main(String[] args) {
	System.out.println("hi");
	
	//System.out.println("anil");
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anilp\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    



	System.out.println("test");
}}
