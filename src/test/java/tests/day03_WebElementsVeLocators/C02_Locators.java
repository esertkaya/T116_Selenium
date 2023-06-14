package tests.day03_WebElementsVeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_Locators {
    public static void main(String[] args) throws InterruptedException {
        /*
          Locator verdigimiz locate bilgisini kullanarak
          driver'in locate etmesini saglayan hazir method'lardir
          Selenium'da n8 adet Locator vardir
          --Ilk 6 tanesi WebElementi olusturan html kodun icerigine baglidir
            1-By.id
            2-By.name
            3.By.className
            4-By.linkText
            5-By.partialLinkText
            6-By.tagName
          --Son iki tane ise her turlu WebElement icin kullanilabir
            7-By.xPath
            8-By.cssSelector
         */

        System.setProperty("Webderiver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        //arama kutusuna Nutella yazip aratalim
        WebElement aramaKutusuElementi= driver.findElement(By.name("field-keywords"));
        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        //gosterilen urun resimlerinin 10'dan fazla oldugunu test edin
        //Locator stratejisi olarak B.className secildiginde
        //class attribute'unun degeri space iceriyorsa
        //Locate islemei basarisiz olabilir
        //5.urun isminin Nutella icerdigini test edin

        List<WebElement> urunIsimElementleriList=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        if (urunIsimElementleriList.size()>10) {
            System.out.println("Listelenen urun sayisi PASSED");
        }else {
            System.out.println("Listelenen urun sayisi FAILED");
        }

        //5.urun ismini yazdirin ve ismin Nutella icerdigini test edin
        String besinciUrunIsmi=urunIsimElementleriList.get(4).getText();
        System.out.println("5.urun ismi: "+besinciUrunIsmi);
        String expectedIcerik="Nutella";
        if (besinciUrunIsmi.contains(expectedIcerik)){
            System.out.println("Besinci urun isim testi PASSED");
        }else{
            System.out.println("Besinci urun isim testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
