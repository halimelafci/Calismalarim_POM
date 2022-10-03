package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement facebookEmail;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement facebookPassword;

    @FindBy(xpath = "//button[@name=\"login\"]")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//div[@class=\"_9axz\"]")
    public WebElement basarisizGiris;

    @FindBy (xpath = "(//button[@value=\"1\"])[2]")
    public WebElement evetDevamEt;


}
