package tests.day01_SeleniumIlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");



    }
}