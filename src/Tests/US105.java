package Tests;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US105 extends BaseDriver {

    @Test
    public void US_105() {

        Basla();

        WebElement profile= driver.findElement(By.xpath("//div[@id='HM_v8']"));
        profile.click();

        WebElement hesabim = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        hesabim.click();
        WebElement siparis = driver.findElement(By.xpath("//a[text()='Siparişlerim']"));
        siparis.click();
        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/siparislerim/"));
        WebElement siparisVarmi = driver.findElement(By.xpath("//div[@class='no-record']"));
        Assert.assertTrue("Siparişiniz Bulunmaktadır", siparisVarmi.getText().equals("Kayıtlı siparişiniz bulunmuyor."));

        BekleVeKapat();

    }


}
