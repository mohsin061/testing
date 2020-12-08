package comGeeksoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test (groups=("Smoke"))
	public void Amazon() {
		System.setProperty("webdriver.chrome.driver", "/Users//mohsinpatwary//Documents//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		System.out.println("Amazon url is: " + driver.getTitle());
	}
	@Test
	public void StudentLoanFahim() {
		System.out.println("Student Loan for Fahim");
	}
	@Test (groups=("Smoke"))
	public void StudentLoanRaisa() {
		System.out.println("Student Loan for Raisa");
	}

}
