package config;

import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Configuration.*;

public class WebDriverProvider {

    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void configuration() {
        pageLoadStrategy = "eager";
        baseUrl = config.getBaseUrl();
        browser = config.getBrowser();
        browserVersion = config.getBrowserVersion();
        browserSize = config.getBrowserSize();
        String remoteUrl = config.getRemoteURL();
        if (remoteUrl != null) {
            remote = remoteUrl;
        }
    }
}