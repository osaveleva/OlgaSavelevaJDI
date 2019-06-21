package jdi;

import base.jdi.HomePageJDISite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.logger.LogLevels.INFO;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverFactory.close;

public class HomePageInits extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        logger.setLogLevel(INFO);
        WebSite.init(HomePageJDISite.class);
        logger.info("Run Tests");
    }
    @AfterMethod
    public void afterMethod(){
        close();
    }
}
