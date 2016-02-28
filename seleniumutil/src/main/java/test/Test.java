package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	private WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		Test test = new Test();
		WebDriver driver = test.getDriver();
		driver.get("http://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		System.out.println(title);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
