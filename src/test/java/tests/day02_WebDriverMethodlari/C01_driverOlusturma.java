package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverOlusturma {

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        //bu class'a kullanilacak webdriver'i ve bu driver ile ilgili dosyalari nerede bulabilecegimizi tanimlar.
        WebDriver driver=new ChromeDriver();
        //driver objesi olusturur, bu obje bizim icin istedigimiz web sayfalarina gidebilecek
        //o sayfalarda istedigimiz islemi yapabilecek ozelliklerdedir
        //Web sayfalarina gidebilmek ve islemler yapabilmek icin bir browser'a ihtiyac oldugundan
        //driver objesi setProperty ile tanimladigimiz browser'in bir kopyasini olusturur
        //ve bu kopya browser ile tum islemleri yapar


    }
}
/*
   Selenium'u projemize dahil edebilmek icin normalde maven altyapisini kullaniriz.
   Ancak maven sart degildir, bir framework'e selenium dosyalarini eklerseniz
   Selenium kutuphanelerini kullanabilirsiniz.
   Bir projeye selenium eklemenin en ilkel yolu
   File/ProjectStructure/Modules/Dependencies
   sekmelerini secip Selenium jar dosyalarini manuel olarak projeye eklemektir
   ancak bu yontem tek basina yeterli degildir
   Selenium yaninda kullanacagimiz webdriver'i da projemize eklememiz gerekir
   Her bilgisayarda kullanilan browser ve o browser'in versiyonu farkli olacagindan
   bu yontemi kullandigimizda her class'da kullanilacak driver'i sisteme tanitmamiz gerekir
   Selenium ile otomasyon yapabilmek icin browser'a ihtiyacimiz var.
 */
