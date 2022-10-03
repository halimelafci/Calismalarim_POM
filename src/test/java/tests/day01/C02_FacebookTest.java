package tests.day01;

import Utilities.ConfigReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;

public class C02_FacebookTest {

    FacebookPage facebookPage=new FacebookPage();
    Faker faker=new Faker();

    @Test
    public void test01(){
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("FacebookUrl"));

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        //girisin basarisiz oldugunu test edin.

        facebookPage.facebookEmail.sendKeys(faker.internet().emailAddress());
        facebookPage.facebookPassword.sendKeys(faker.internet().password());
        facebookPage.girisYapButonu.click();
        try {
            Assert.assertTrue(facebookPage.basarisizGiris.isDisplayed());

        } catch (Exception e) {
            Assert.assertTrue(facebookPage.evetDevamEt.isDisplayed());

        }





    }

}
