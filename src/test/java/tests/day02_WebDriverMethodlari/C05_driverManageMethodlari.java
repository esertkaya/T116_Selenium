package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicitlyWait Selenium'dan gelen DINAMIK bir beklemedir
        //Sayfanin yuklenmesi veya islem yapilacak we elementlerin bulunmasi icin bekleneek maximum sureyi belirler
        //Driver bu sure dolana kadar verilen gorevin yapilip yapilmadigini kontrol eder
        //Bu sure icerisinde gorev yapilamazsa exception firlatip calismayi durdurur

        driver.get("https://www.wisequarter.com");
        System.out.println("Baslangic konumu: "+driver.manage().window().getPosition());
        System.out.println("Baslangic size: "+driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));
        System.out.println("Degisen Baslangic konumu: "+driver.manage().window().getPosition());
        System.out.println("Degisen Baslangic size: "+driver.manage().window().getSize());



        Thread.sleep(3000);
        driver.close();
    }
}
