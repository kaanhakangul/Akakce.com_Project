package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static {  //bunun sarti extends olmasi ve basta yer almasi

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // (web sayfasına özel 20 sn bekle)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // (Genel tüm WebElementler için 20 sn bekle)
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));

    }

    public static void Basla(){

        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='life']"));
        emailInput.sendKeys("kaanhakang@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Hakan5535.");

        WebElement girisYButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/akakcem/']")));
    }

    public static void BekleVeKapat(){

        MyFuncs.Bekle(3);
        driver.quit();


    }
}
