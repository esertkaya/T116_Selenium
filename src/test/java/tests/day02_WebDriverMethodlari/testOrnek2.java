package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testOrnek2 {
    public static void main(String[] args) throws InterruptedException {
        //1.Yeni bir Class olusturalim.C05_NavigationMethods

        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Youtube ana sayfasina gidelim . https://
        //www.youtube.com/
        driver.get("https://www.youtube.com");
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().back();
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //7.Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(3000);
        driver.close();
    }
}
