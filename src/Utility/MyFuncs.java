package Utility;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyFuncs {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void SuccessMessageValidation(){

        WebElement msgLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }
}
