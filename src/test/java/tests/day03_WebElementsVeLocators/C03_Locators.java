package tests.day03_WebElementsVeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> kategoriElementleriList=driver.findElements(By.className("panel-heading"));
        //4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi=3;
        int actualKategoriSayisi=kategoriElementleriList.size();
        if (expectedKategoriSayisi==actualKategoriSayisi){
            System.out.println("Kategori sayisi testi PASSED");
        }else{
            System.out.println("Kategori sayisi testi FAILED");
        }
        //5- Category isimlerini yazdirin
       // System.out.println(kategoriElementleriList);
        /*
          Biz bir listeyi direkt olarak yazdirabiliriz
          ANCAK bu liste WebElementler icerdigi icin
          direkt yazdirmak istersek bzie 3 tane referans degeri yazdirir

          WebElementleri direkt yazdiramayacagimiz icin
          bir for-each loop kullanarak herbir webeleneti alip
          onun uzerindeki texti yazdirmaliyiz
         */

        for (WebElement eachElement:kategoriElementleriList) {
            System.out.println(eachElement.getText());
        }
        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();
    }
}
