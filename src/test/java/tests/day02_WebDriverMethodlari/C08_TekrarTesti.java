package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {

        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedTitle="youtube";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Youtube Title testi PASSED");
        }else{
            System.out.println("Youtube Title testi FAILED\nActual Title: "+actualTitle);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String expectedUrlIcerik="youtube";
        String actualUrlIcerik= driver.getCurrentUrl();
        if (expectedTitle.contains(actualUrlIcerik)){
            System.out.println("Youtube Url Icerik Testi PASSED");
        }else{
            System.out.println("Youtube Url Icerik testi FAILED\nActual URL: "+actualUrlIcerik);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().back();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitleAmazon="Amazon";
        String actualTitleAmazon=driver.getTitle();
        if (expectedTitleAmazon.contains(actualTitleAmazon)){
            System.out.println("Amazon Title Testi PASSED");
        }else{
            System.out.println("Amazon Title testi FAILED\nActual Title: "+actualTitleAmazon);
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın
        String expectedUrlAmazon="https://www.amazon.com/";
        String actualUrlAmazon= driver.getCurrentUrl();
        if (expectedUrlAmazon.equals(actualUrlAmazon)){
            System.out.println("Amazon URL testi PASSED");
        }else{
            System.out.println("Amazon URL testi FAILED\nActual URL: "+actualUrlAmazon);
        }
        //11.Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
