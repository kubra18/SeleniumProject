package day01_DriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Selenium_manager {
    public static void main(String[] args) {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
