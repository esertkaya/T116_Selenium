package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class p03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/selenium-java-4.9.0/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(2500);
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("3");
        // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("8");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        String result=driver.findElement(By.xpath("//*[@id='answer']")).getText();

        // Print the result
        System.out.println("result = " + result);
        driver.close();
}
}