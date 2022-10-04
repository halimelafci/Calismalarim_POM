package tests.SmokTest;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class C02_NegatifTest {


    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    @Test
    public void yanlisKullaniciAdi(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLogin.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.ikinciLogin.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());
    }

    @Test
    public void yanlisPasswordTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLogin.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.ikinciLogin.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());

    }

    @Test
    public void yanlisKullaniciveYnlisSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLogin.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.ikinciLogin.click();
        Assert.assertTrue(hotelMyCampPage.basarisizGiris.isDisplayed());

    }
}
