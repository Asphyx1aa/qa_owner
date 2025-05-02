package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.TestsConfigProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void testSetup() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = TestsConfigProvider.getBaseUrl();
        Configuration.browserSize = TestsConfigProvider.getBrowserSize();
        Configuration.browserVersion = TestsConfigProvider.getBrowserVersion();
        Configuration.browser = TestsConfigProvider.getBrowser();
        Configuration.remote = TestsConfigProvider.getServer();
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
