package tests.day03_WebElementsVeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //Arama cubuguna "Nutella yazdirip aratin"
        /*
          Bir webelementi kullanabilmek icin
          oncelikle o webelementi driver'in bulabilmesi icin
          Locate etmeliyiz
          Yani yerini tarif edecek bilgiye ulasmaliyiz

          amazon arama cubugu icin bu bilginin id=twotabsearchtextbox oldugunu
          amazon sayfasinda arastirma yaparak bulduk

          Sonra bu locate bilgisini kullanarak web sayfasinda
          o elementi bulup bu class'da o webelementi kullanabilmek icin
          kaydedecek bir hazir method'a ihtiyacimiz var
         */

       WebElement aramaKutusuElement= driver.findElement(By.id("twotabsearchtextbox"));
       //bu satirda 3 islem yapiliyor
        //1-Locate islemi: twotabsearchtextbox
        //2-Bu locate'i kullanarak istedigimiz arama kutusunu bize getirecek method: driver.findElement(locate strategy)
        //3-Locate edip findElement() ile buldugumuz webelementi icinde bulundugumuz class'da kullanabilmek icin
        //  bir webelement objesine atamak
        aramaKutusuElement.sendKeys("Nutella");
        aramaKutusuElement.submit();
        //Arama sonuclarinin Nutella icerdigini test edin
        WebElement aramaSonucElementi= driver.findElement(By.className("sg-col-inner"));
       // System.out.println(aramaSonucElementi);
        //aramaSonucElementi bir WebElement
        //aramaSonucObjesini bir WebElement olarak olusturduk
        //WebElement bir primitive data turu olmadigindan
        //direkt yazdirmak istersek referansini yazdirir

        System.out.println(aramaSonucElementi.getText());
        String expectedIcerik="Nutella";
        String actualSonucYazisi=aramaSonucElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella arama testi PASSED");
        }else{
            System.out.println("Nutella arama testi FAILED");
        }
        Thread.sleep(5000);
        driver.close();
    }
}