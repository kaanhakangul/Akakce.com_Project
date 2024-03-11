package Tests;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US104 extends BaseDriver {

    @Test
    public void US_104() {


        driver.get("https://www.akakce.com/");

        WebElement girisyap = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisyap.click();
        WebElement mailgiris = driver.findElement(By.xpath("//input[@id='life']"));
        mailgiris.sendKeys("kaanhakang@gmail.com");
        WebElement passgiris = driver.findElement(By.xpath("//input[@id='lifp']"));
        passgiris.sendKeys("Hakan5535.");
        WebElement giris = driver.findElement(By.xpath("//input[@id='lfb']"));
        giris.click();

        WebElement hesabim= driver.findElement(By.xpath("//div[@id='HM_v8']"));

        Assert.assertTrue("Kullanıcı giriş yapamadı.", hesabim.isDisplayed());

        BekleVeKapat();

    }

}
