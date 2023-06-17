package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    //Create a new class with main method
    public static void main(String[] args) throws InterruptedException {
     //Set Path
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        //Create a chrome driver
        WebDriver driver=new ChromeDriver();
        // Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


   // Open google home page
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
        // On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
  //  Wait about 4 sn
        Thread.sleep(4000);
  //  Navigate forward to amazon
        driver.navigate().forward();
  //  Refresh page
        driver.navigate().refresh();
  //  Close/quit the browser
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);

        //driver.close();//calistigimiz pencereyi kapatir
        driver.quit(); //actigimiz tum pencereleri kapatir
  //  And Last step print "All is well" on console
        System.out.println("All is well");
        System.err.println("Hayat guzeldir");

    }
}
