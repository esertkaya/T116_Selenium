package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testOrnek {
    //1.Yeni bir package olusturalim : day01
    //2. Yeni bir class olusturalim : C03_GetMethods

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon Title Test PASSED");
        }else{
            System.out.println("Amazon Title Test FAILED\nActual Title: "+actualTitle);
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7.Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl="Amazon";
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.contains(actualUrl)){
            System.out.println("Amazon Url Test PASSED");
        }else{
            System.out.println("Amazon Url Test FAILED\nActual Title: "+actualUrl);
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String expectedHtml="Gateway";
        String actualHtml= driver.getPageSource();
        if (actualHtml.contains(expectedHtml)){
            System.out.println("Html test PASSED");
        }else{
            System.out.println("Html Test FAILED\nActual Html: "+actualHtml);
        }
        //10.Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
