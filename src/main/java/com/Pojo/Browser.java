package com.Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver OpenBrowser (String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\New_Eclipse_Workspace\\Amazon\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		return driver;
	}
}
