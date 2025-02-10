package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;  // Import WebElement

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
	AppiumDriver<MobileElement> appiumDriver;


    @BeforeClass
    public void setUp() throws MalformedURLException {
	    
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");  // App package
        capabilities.setCapability("appPackage", "com.wdiodemoapp");  // App activity
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");  // App activity
        
        // Start the Appium driver and launch the app
        URL appiumServer = new URL("http://localhost:4723/wd/hub");
        appiumDriver = new AppiumDriver<>(appiumServer, capabilities);
    }

    @Test
    public void testAppLaunch() {
        // Example of interacting with the app
        MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
        loginLabel.click();

        // Verify if video is playing or interaction succeeded
        Assert.assertTrue(loginLabel.isDisplayed(), "Play button is not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (appiumDriver != null) {
        	appiumDriver.quit();
        }
    }
}
