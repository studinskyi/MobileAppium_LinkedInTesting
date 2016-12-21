package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Login Page locators

    By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");
    By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
    By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
    By loginButton = By.id(app_package_name + "growth_login_fragment_sign_in");
    By homeButton = By.id(app_package_name + "home_nav_tab_icon");
    String myEmail = "DmitrStud_TestMob@mail.ru";
    String myPassword = "TestMob_2016_DmitrStud";

    public HomePage loginIntoProfile() {

        waitForVisibilityOf(firstSignIn);

        driver.findElement(firstSignIn).click();

        driver.findElement(userEmail).sendKeys(myEmail);
        driver.findElement(userPassword).sendKeys(myPassword);

        driver.findElement(loginButton).click();

        waitForVisibilityOf(homeButton);


        return new HomePage(driver);
    }

    //    @Test
    //    public void showTest() {
    //
    //        String app_package_name = "com.linkedin.android:id/";
    //        By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");
    //        By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
    //        By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
    //        By showButton = By.id(app_package_name + "growth_login_join_show_hide_password");
    //        By signInButton = By.id(app_package_name + "growth_login_fragment_sign_in");
    //        By homeAppLauncher = By.id(app_package_name + "home_activity_app_launcher");
    //
    //        // 1 - вариант входа в приложение
    //        waitForVisibilityOf(firstSignIn);
    //
    //        driver.findElement(firstSignIn).click();
    //        driver.findElement(userEmail).clear();
    //        driver.findElement(userEmail).sendKeys(strLoginUser);
    //        driver.findElement(userPassword).sendKeys(strPasswordUser);
    //        driver.findElement(showButton).click();
    //
    //        String typedUser = driver.findElement(userEmail).getText();
    //        Assert.assertEquals(typedUser, strLoginUser);
    //
    //        String typedPass = driver.findElement(userPassword).getText();
    //        Assert.assertEquals(typedPass, strPasswordUser);
    //
    //        driver.findElement(signInButton).click();
    //
    //        // ожидание открытия рабочего окна аккаунта linkedin
    //        waitForVisibilityOf(homeAppLauncher);
    //        Assert.assertNotNull(homeAppLauncher);
    //
    //
    //        //        // 2 вариант входа в приложение
    //        //        //waitForVisibilityOf(firstSignIn);
    //        //        driver.pressKeyCode(AndroidKeyCode.HOME);
    //        //        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
    //        //        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"LinkedIn\")").click();
    //        //        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();
    //        //        driver.findElement(userEmail).sendKeys(strLoginUser);
    //        //        driver.findElement(userPassword).sendKeys(strPasswordUser);
    //        //        driver.findElement(showButton).click();
    //        //
    //        //        String typedUser = driver.findElement(userEmail).getText();
    //        //        Assert.assertEquals(typedUser, strLoginUser);
    //        //
    //        //        String typedPass = driver.findElement(userPassword).getText();
    //        //        Assert.assertEquals(typedPass, strPasswordUser);
    //        //
    //        //        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign in\")").click();
    //        //
    //        //        // ожидание открытия рабочего окна аккаунта linkedin
    //        //        waitForVisibilityOf(homeAppLauncher);
    //        //        Assert.assertNotNull(homeAppLauncher);
    //
    //
    //    }

}
