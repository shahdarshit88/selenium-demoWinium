package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Notepad_Menu {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		
		Thread.sleep(2000);
		driver.findElement(By.name("File")).click();
	}
}