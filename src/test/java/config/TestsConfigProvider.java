package config;

import org.aeonbits.owner.ConfigFactory;

public class TestsConfigProvider {

    public static TestsBaseConfig config = ConfigFactory.create(TestsBaseConfig.class);

    public static String getServer() {
        if(config.getEnv().equals("remote")) {
            String username = config.getLogin();
            String password = config.getPassword();
            String wdhost = config.getHost();

            return "https://" + username + ":" + password + "@" + wdhost;
        } else {
            return null;
        }
    }
}
