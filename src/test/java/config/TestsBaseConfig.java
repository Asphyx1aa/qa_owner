package config;

import org.aeonbits.owner.*;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"
})

public interface TestsBaseConfig extends Config {

    @Key("login")
    String getLogin();

    @Key("password)")
    String getPassword();

    @Key("host")
    String getHost();

    @Key("baseUrl")
    @DefaultValue("https://matteobaccan.github.io")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("128.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("env")
    @DefaultValue("local")
    String getEnv();
}
