package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public class TestsConfigProvider {

    static TestsBaseConfig config = ConfigFactory.create(TestsBaseConfig.class);

    public static String getLogin() {
        return config.login();
    }

    public static String getPassword() {
        return config.password();
    }

    public static String getHost() {
        return config.wdhost();
    }

    public static String getBaseUrl() {
        return config.baseUrl();
    }

    public static String getBrowser() {
        return config.browser();
    }

    public static String getBrowserVersion() {
        return config.browserVersion();
    }

    public static String getBrowserSize() {
        return config.browserSize();
    }

    @Config.Key("isRemote")
    @Config.DefaultValue("false")
    public static Boolean isRemote() {
        return config.isRemote();
    }

    public static String getServer() {
        if(config.isRemote()) {
            String username = getLogin();
            String password = getPassword();
            String wdhost = getHost();

            return "https://" + username + ":" + password + "@" + wdhost;
        } else {
            return null;
        }
    }
}
