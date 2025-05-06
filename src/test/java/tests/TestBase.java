package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.TestsBaseConfig;
import config.TestsConfigProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void testSetup() {
        Configuration.baseUrl = TestsConfigProvider.config.getBaseUrl();
        Configuration.browserSize = TestsConfigProvider.config.getBrowserSize();
        Configuration.browserVersion = TestsConfigProvider.config.getBrowserVersion();
        Configuration.browser = TestsConfigProvider.config.getBrowser();
        Configuration.remote = TestsConfigProvider.getServer();
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
