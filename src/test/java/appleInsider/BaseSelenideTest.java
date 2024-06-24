package appleInsider;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract class BaseSelenideTest {


    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }
    @BeforeEach
    public void init(){
        setUp();
    }
    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
