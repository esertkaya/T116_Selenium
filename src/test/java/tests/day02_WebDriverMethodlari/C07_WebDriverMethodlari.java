package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_WebDriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //1.Yeni bir class olusturalim (Homework)
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");

        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Facebook title testi PASSED");
        }else{
            System.out.println("Facebook title testi FAILED");
            System.out.println("Actual Title is: "+actualTitle);
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Facebook url testi PASSED");
        }else{
            System.out.println("Facebook Url testi Failed\nActual Url : "+actualUrl);
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleIcerik="Walmart.com";
        String actualTitleIcerik=driver.getTitle();
        if (actualTitleIcerik.contains(expectedTitleIcerik)){
            System.out.println("Walmart title testi PASSED");
        }else{
            System.out.println("Walmart title testi FAILED");

        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //9.Browser’i kapatin
        driver.close();

    }
}
