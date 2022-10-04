package tests.SmokTest;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class C01_PozitifTest {

    //pozitif test de girilen bilgilerin tamami dogru olup o sekilde giris yapılmali pozitif senaryo
    // örnek : hem kullanici ismi ,mail dogru olmali hem de şifre dogru olmali

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLogin.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.ikinciLogin.click();


    }
}
