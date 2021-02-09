package ui.common;

import com.codeborne.selenide.WebDriverRunner;
import com.testapp.parameters.ConfigurationParameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class BaseTest {

    protected ConfigurationParameters configurationParameters;

    @BeforeSuite
    public void beforeSuite() {
        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriverRunner.webdriverContainer.setWebDriver(chromeDriver);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() {
        clearBrowserCache();
        closeWebDriver();
    }
}
