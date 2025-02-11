package pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LoginPage {
	
	private AppiumDriver<MobileElement> appiumDriver;
	private final By usernameSelById = MobileBy.AccessibilityId("input-email");
	private final By passwordSelById = MobileBy.AccessibilityId("input-password");
	private final By loginBtnSelById= MobileBy.AccessibilityId("button-LOGIN");
	
	public LoginPage(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
	}
	
	public AppiumDriver<MobileElement> getAppiumDriver(){
		return appiumDriver;
	}
	
	public MobileElement username() {
		return appiumDriver.findElement(usernameSelById);
	}
	
	public MobileElement password() {
		return appiumDriver.findElement(passwordSelById);
	}
	
	public MobileElement loginBtn() {
		return appiumDriver.findElement(loginBtnSelById);
	}
	
	
	public void inputUsername(String usernameText) {
		appiumDriver.findElement(usernameSelById).sendKeys(usernameText);
		this.username().sendKeys(usernameText);
	}
		
	
	public void inputPassword(String passwordText) {
		appiumDriver.findElement(passwordSelById).sendKeys(passwordText);
		this.password().sendKeys(passwordText);
	}
		
	public void clickLoginButton() {
		appiumDriver.findElement(loginBtnSelById).click();
		this.loginBtn().click();;
			
	}

}
