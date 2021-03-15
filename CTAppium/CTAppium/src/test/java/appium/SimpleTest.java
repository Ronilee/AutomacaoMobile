package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SimpleTest {
    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
//        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
//        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
//        MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("multiply");
//        el2.click();
//        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
//        el3.click();
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
//        el4.click();
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown() {
//        driver.quit();
        System.out.printf("fim");
    }
}
