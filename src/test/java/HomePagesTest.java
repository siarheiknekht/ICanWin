import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import unit.BaseTest;

import java.util.concurrent.TimeUnit;

public class HomePagesTest extends BaseTest {
    private HomePage homePage;

    @BeforeClass
    public void setupPages() {
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    public void simpleTest() {
        homePage.pasteInput("Hello from WebDriver");
        homePage.inputName("helloweb");
//        does not work on this site
//        homePage.select10MinExpiration();

    }
}
