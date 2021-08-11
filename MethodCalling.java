package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Userdefined.Methods;

public class MethodCalling extends Methods{
public static void main(String[] args) throws IOException {
	Methods object = new Methods();
	object.getDriver();
	object.Launchurl("https://www.facebook.com/");
	object.takesScreenshot("Home");
	WebElement user = driver.findElement(By.id("email"));
	object.enterText(user, "Welcome");
	object.takesScreenshot("Username");
	WebElement p = driver.findElement(By.name("pass"));
	object.enterText(p, "WelcomeJava");
	object.takesScreenshot("Password");
}
}
