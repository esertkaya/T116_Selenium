package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) throws InterruptedException {
        //1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        //2-Java class'imiza chnomedriver.exet i tanitalim
        WebDriver driver=new ChromeDriver();
       // 3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
       //4-"https://www.otto.de" adresine gidelim
       driver.get("https://www.otto.de");
       // 5-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
       driver.findElement(By.xpath("//button[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();
       // 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        driver.getTitle();
        driver.getCurrentUrl();
      // 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        String expectedTitle="OTTO";
        String actualTitle= driver.getTitle();
        String expecteURL="OTTO";
        String actualUrl=driver.getCurrentUrl();


      if (actualTitle.contains(expectedTitle)&&(actualUrl.contains(expecteURL))){
            System.out.println("Title and URL test PASSED");
      }else{
          System.out.println("Title and URL test FAILED");
      }
      //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");
      //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        driver.getTitle();
        String expectedTitle2="Quarter";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Quarter testi PASSED");
        }else{
            System.out.println("Quarter testi FAILED");
        }
        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
       // driver.findElement(By.xpath("//button[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();
        // 11-Sayfayı yenileyelim
        driver.navigate().refresh();
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
       // driver.findElement(By.xpath("//button[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();
        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        Thread.sleep(4000);
        driver.close();
        driver.quit();

    }
}
