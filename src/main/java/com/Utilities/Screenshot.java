package com.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void getScreenshot(WebDriver driver, String Filename) throws IOException {
		String Time = Date.getDate();
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Nikita\\Documents\\New_Eclipse_Workspace\\Amazon\\Screenshots\\");
		FileHandler.copy(Source, Destination);
	}
}
