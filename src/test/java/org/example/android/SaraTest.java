package org.example.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AutomationName;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntriesFilter;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.Set;


public class SaraTest {
    static AppiumDriver driver;
    static Dotenv dotenv = Dotenv.load();
    static File file = new File(Objects.requireNonNull(dotenv.get("APP_NAME")));

    public static void main(String[] args){

        System.out.println(file.getAbsolutePath());
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
        cap.setCapability("deviceName", dotenv.get("DEVICE_NAME"));
        cap.setCapability("udid", dotenv.get("UDID"));
        //cap.setCapability("udid", "18271FDF60018Y");
        cap.setCapability("platformName", dotenv.get("PLATFORM_NAME"));
        cap.setCapability("platformVersion", dotenv.get("PLATFORM_VERSION"));
        cap.setCapability("appium:automationName", dotenv.get("AUTOMATION_NAME"));
        cap.setCapability("app", file.getAbsolutePath());

        driver = new AppiumDriver(new URL(dotenv.get("APPIUM_HOST") + ":" + dotenv.get("APPIUM_PORT")), cap);

        System.out.println("Application started...");
    }
}
