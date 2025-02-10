package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;  // Import WebElement

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "device");
        capabilities.setCapability("deviceName", "emulator-5554");  // Replace with your emulator/device name
        capabilities.setCapability("app", "C:\\Users\\preethy.ramamoorthy\\source\\repos\\Appium\\adk\\samsungyoutube.apkm");  // App package
        //capabilities.setCapability("APP_ACTIVITY", "com.samsung.android.youtube.activity.MainActivity");  // App activity
        capabilities.setCapability("automationName", "UiAutomator2");

        // Start the Appium driver and launch the app
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testAppLaunch() {
        // Example of interacting with the app
        WebElement playButton = driver.findElement(By.id("com.samsung.android.youtube:id/play_button"));
        playButton.click();

        // Verify if video is playing or interaction succeeded
        Assert.assertTrue(playButton.isDisplayed(), "Play button is not displayed");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
