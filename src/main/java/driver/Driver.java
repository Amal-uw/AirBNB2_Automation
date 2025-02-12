package driver;

import fileUtils.ConfigReader;
import org.openqa.selenium.WebDriver;


public class Driver  {
    public Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browserType").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadFromDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Unsupported browser type " + ConfigReader.getProperty("browserType"));
            }
        }
        return driver;
    }
}
