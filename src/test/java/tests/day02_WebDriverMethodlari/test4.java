package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test4 {
    public static void main(String[] args) throws InterruptedException {
        //1.Yeni bir Class olusturalim.C07_ManageWindowSet
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde
        //ayarlayin
        driver.manage().window().setSize(new Dimension(100,200));
        driver.manage().window().setPosition(new Point(100,200));
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test
        //edin
        System.out.println("Degisen size: "+driver.manage().window().getSize());
        System.out.println("Degisen Konum: "+driver.manage().window().getPosition());
        //8. Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
