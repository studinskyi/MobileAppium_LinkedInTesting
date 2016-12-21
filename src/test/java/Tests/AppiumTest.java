package Tests;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MessagePage;
import SetUp.AndroidSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppiumTest extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    // Test #1
    @Test
    public void loginTest() {

        new LoginPage(driver).loginIntoProfile();
    }

    // Test #2
    @Test

    public void searchTest(){

        new HomePage(driver)
                .searchFor("Arthur Pilyuk")
                .selectResultListItem("Arthur Pilyuk")
                .clickOnMessageButton();
    }

    // Test #3
    @Test

    public void sendMessageToContact(){

        new MessagePage(driver)
                .createMessage()
                .checkForSending();
    }

    // Test #4
    @Test
    public void testSwipeOnHomePage()  {
        new HomePage(driver).swipeFromRightToPullMenu();

    }

    // Test #5
    @Test
    public  void testScrollUponHomePage(){
        new HomePage(driver).scrollUponHomePage();

    }


}
