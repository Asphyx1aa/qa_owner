package config;

import org.aeonbits.owner.*;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"
})

public interface TestsBaseConfig extends Config {

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("136.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("false")
    Boolean isRemote();
}
