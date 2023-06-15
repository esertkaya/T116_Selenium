package tests.day03_WebElementsVeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class testSelenium {
    public static void main(String[] args) throws InterruptedException {

        // WebDriver'ı yapılandırma ve tarayıcıyı başlatma
        System.setProperty("Webdriver.chrome.driver", "src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon web sitesine git
        driver.get("https://www.amazon.com/");

        // Arama kutusunu bul ve "city bike" terimini ara
        WebElement searchBox = driver.findElement(By.id(("twotabsearchtextbox")));
        searchBox.sendKeys("city bike");
        searchBox.submit();

        // İlgili sonuçların sayısını bul ve yazdır
        List<WebElement> urunSayisiList=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));

        // İlk sonuçun resmine tıkla
        WebElement ilkSOnucResmi = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
        ilkSOnucResmi.click();

        // WebDriver'ı kapat ve tarayıcıyı kapat
        Thread.sleep(3000);
        driver.close();
    }
}


