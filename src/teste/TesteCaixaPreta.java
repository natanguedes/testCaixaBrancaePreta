package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCaixaPreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/chrome/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://google.com/");
        	WebElement formEmail = chrome.findElement(By.name("q")); //busca pelo name	
        	formEmail.sendKeys("oii");
        	formEmail.submit();
	}
	


//}
	
}

