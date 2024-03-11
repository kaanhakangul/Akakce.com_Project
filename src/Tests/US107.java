package Tests;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US107 extends BaseDriver {

    @Test
    public void US_107(){

        Basla();

        WebElement profile= driver.findElement(By.xpath("//div[@id='HM_v8']"));
        profile.click();

        WebElement hesabim = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        hesabim.click();
        WebElement hesapSil = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        hesapSil.click();
        WebElement pass3 = driver.findElement(By.xpath("//input[@id='p']"));
        pass3.sendKeys("Sdet123**");
        WebElement hSilBtn = driver.findElement(By.xpath("//input[@id='u']"));
        hSilBtn.click();

        BekleVeKapat();


    }
}
