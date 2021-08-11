package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDay1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Vaishu\\eclipse-workspace\\MavenDay1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
