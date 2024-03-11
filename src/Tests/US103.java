package Tests;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US103 extends BaseDriver {

    @Test
    public void US_103(){

        Basla();

        Actions actionD = new Actions(driver);
        WebElement hesabim = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='H_a_v8']")));

        Action actionHowe = actionD.moveToElement(hesabim).build();
        actionHowe.perform();

        WebElement cik = driver.findElement(By.xpath("//a[@href='#Çık']"));
        cik.click();

        WebElement textGirisYap2 = driver.findElement(By.linkText("Giriş Yap"));
        wait.until(ExpectedConditions.textToBe(By.linkText("Giriş Yap"), "Giriş Yap"));
        Assert.assertTrue("Çıkış yapılamadı.", textGirisYap2.getText().contains("Giriş Yap"));

        BekleVeKapat();
    }
}
