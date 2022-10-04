package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelMyCampPage {


    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLogin ;

    @FindBy(xpath = "//input[@id=\"UserName\"]")
    public WebElement username;

    @FindBy(xpath = "//input[@id=\"Password\"]")
    public WebElement password;

    @FindBy(xpath = "//input[@id=\"btnSubmit\"]")
    public WebElement ikinciLogin;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[1]")
    public WebElement basariliGiris;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement basarisizGiris;
}
