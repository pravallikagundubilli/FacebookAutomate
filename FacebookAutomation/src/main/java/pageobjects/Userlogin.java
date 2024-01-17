package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Userlogin extends BaseClass {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
    WebElement txt_username;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
    WebElement txt_password;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
    WebElement signinButton;
    public Userlogin(){
        PageFactory.initElements(driver,this);
    }
    public void signinpage()
    {
        txt_username.sendKeys("8341265851");
        txt_password.sendKeys("pravallika@1562");
        signinButton.click();


    }
}
