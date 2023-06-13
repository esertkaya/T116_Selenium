package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //wise quarter ana sayfaya gidelim
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(2000);

        //ayni browser'da amazon ana sayfaya gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //tekrar wise ana sayfaya donun
        driver.navigate().back();
        Thread.sleep(2000);
        //yeniden amazona gidin
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();



    }
}
