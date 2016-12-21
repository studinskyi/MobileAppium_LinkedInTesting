package SetUp;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("d:\\QA_Hillel\\LR25_mobile\\LR26_MobileAppium_LinkedInTesting\\apps\\");
        //File appDir = new File("/myAppiumProject/apps");
        //File appDir = new File("/SeleniumTests/AppiumLR/apps");
        File app = new File(appDir, "linkedin-4-0-95.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("device","Android");
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //        File appDir = new File("/SeleniumTests/AppiumLR/apps");
        //        File app = new File(appDir, "linkedin-4-0-52.apk");
        //        DesiredCapabilities capabilities = new DesiredCapabilities();
        //        capabilities.setCapability("device","Android");
        //
        //        capabilities.setCapability("deviceName","Android");
        //
        //        capabilities.setCapability("app", app.getAbsolutePath());
        //        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
