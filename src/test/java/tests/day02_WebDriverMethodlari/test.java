package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle= driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("Amazon expected title PASSED");
        }else{
            System.out.println("Amazon expected title FAILED\nAmazon actual title: "+actualTitle);
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl="amazon";
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.contains(actualUrl)){
            System.out.println("Amazon expected url PASSED");
        }else{
            System.out.println("Amazon expected url FAILED\nAmazon actual url: "+actualUrl);
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        //10. Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
