package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class TestsConfigProvider {

    static TestsBaseConfig config = ConfigFactory.create(TestsBaseConfig.class);

    public static String getBrowser() {
        return config.browser();
    }

    public static String getBrowserVersion() {
        return config.browserVersion();
    }

    public static String getBrowserSize() {
        return config.browserSize();
    }

    public static Boolean isRemote() {
        return config.isRemote();
    }

    public static String getServer() {
        if(config.isRemote()) {
            String username = System.getProperty("login", null);
            String password = System.getProperty("password", null);
            String wdhost = System.getProperty("wdhost", null);

            return "https://" + username + ":" + password + "@" + wdhost;
        } else {
            return null;
        }
    }
}
