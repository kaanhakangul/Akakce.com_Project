package Tests;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US102 extends BaseDriver {


    @Test
    public void US_102(){

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
        WebElement ka = driver.findElement(By.cssSelector("[href='/akakcem/']"));
        System.out.println("ka.getText() = " + ka.getText());

        Assert.assertTrue("Kullanıcı doğrulanamadı.", ka.getText().contains("Hakan"));

        BekleVeKapat();


    }
}
