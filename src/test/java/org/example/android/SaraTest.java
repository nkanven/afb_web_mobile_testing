package org.example.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class SaraTest {
    static AppiumDriver driver;

    public static void main(String[] args){
        try {
            startSara();
        } catch (MalformedURLException e) {
            e.getCause();
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    public static void startSara() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "sdk_gphone64_x86_64");
        cap.setCapability("udid", "emulator-5554");
        //cap.setCapability("udid", "18271FDF60018Y");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13");
        cap.setCapability("appium:automationName", AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability("app", "C:/Users/CM-Nkapro/IdeaProjects/untitled1/src/test/java/org/example/android/SARA_BY_AFRILAND_CAMEROON_2.2.6_apkcombo.com.apk");

        driver = new AppiumDriver(new URL("http://0.0.0.0:4723"), cap);

        System.out.println("Application started...");
    }
}
