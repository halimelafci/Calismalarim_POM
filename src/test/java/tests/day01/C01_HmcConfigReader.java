package tests.day01;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class C01_HmcConfigReader {


    //https://www.hotelmycamp.com/ adresine git  login butonuna bas


    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test01(){

        //https://www.hotelmycamp.com/ adresine git  login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLogin.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.ikinciLogin.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hotelMyCampPage.basariliGiris.isDisplayed());


    }
}
