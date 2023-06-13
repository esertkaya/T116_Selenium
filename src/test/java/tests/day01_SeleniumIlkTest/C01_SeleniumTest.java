package tests.day01_SeleniumIlkTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumTest {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
                 driver.get("https://www.amazon.com");



    }
}
 /*
 Selenium ile testleri calistirirken iyi bir orkestra yoneticisi olmalisiniz
 Hangi enstrumani ne icin kullanacaginiz ve hangi asamada hangi enstrumani projenize dahil edeceginizi bilmeniz gerekir
 Selenium ile test otomasyanu icin minimum oalrak kullanmamiz gereken enstrumanlar:
 1- Programlama Dili (Java) Projeyi olustururken dahil ettik
 2- IDE (Intellij) Zaten Intellij'de calisiyoruz
 3- Selenium Kutuphanesi
    Bunun icin selenium.dev adresinden kullandigimiz bilgisayara uygun jar dosyalarini indirip
    projemizin icerisine kopyaladik
    Bu jar dosyalarini projemize eklemek icin yukaridan file/project structure/modeule/dependencies tabini secip
    + tusuna basarak selenium klasorundeki tum jar dosyalarini projeye ekledik
 4- WebDriver
    Herkesin bilgisayarinin isletim sistemi, bilgisayarinda bulunan Google Chrome browser'inin versiyonu farkli oldugundan
    kendi bilgisayariniz ve Chrome Browser surumune uygun olan selenium.dev adresindeki browser dosyasini indirip
    projemizin altina kopyalamaliyiz
  */