package tests.day03_WebElementsVeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // Chrome WebDriver'ın dizinini belirtin
        System.setProperty("Webdriver.chrome.driver", "src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");

        // WebDriver'ı başlatın
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidin
        driver.get("https://login.bol.com/login?client_id=seller-portal");

        // b. Sign in butonuna tıklayın
        WebElement signInButton = driver.findElement(By.linkText("loginForm"));
        signInButton.click();

        // c. email textbox, password textbox ve signin button elementlerini locate edin
        WebElement emailTextBox = driver.findElement(By.id("j_username"));
        WebElement passwordTextBox = driver.findElement(By.id("j_password"));
        WebElement signInButton2 = driver.findElement(By.id("submit"));



        // d. Kullanıcı adını ve şifreyi girin ve oturum aç (sign in) button'una tıklayın
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("");
        signInButton2.click();

        // e. Expected user id'nin testtechproed@gmail.com olduğunu doğrulayın
        WebElement userId = driver.findElement(By.className("navbar-text"));
        String expectedUserId = "testtechproed@gmail.com";
        String actualUserId = userId.getText();
        if (actualUserId.equals(expectedUserId)) {
            System.out.println("User ID doğrulandı.");
        } else {
            System.out.println("User ID doğrulanamadı.");
        }

        // f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini doğrulayın
        WebElement addressesText = driver.findElement(By.linkText("Addresses"));
        WebElement signOutText = driver.findElement(By.linkText("Sign out"));
        if (addressesText.isDisplayed() && signOutText.isDisplayed()) {
            System.out.println("Addresses ve Sign Out textleri görüntülendi.");
        } else {
            System.out.println("Addresses ve Sign Out textleri görüntülenemedi.");
        }

        // 3. Sayfada kaç tane link olduğunu bulun
        int linkCount = driver.findElements(By.tagName("a")).size();
        System.out.println("Sayfada " + linkCount + " adet link bulunuyor.");

        // WebDriver'ı kapatın
        Thread.sleep(3000);
        driver.quit();
    }
}


