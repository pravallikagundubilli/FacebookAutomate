package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePost extends BaseClass
{

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/p")
    WebElement create;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]/div/span/span")
    WebElement posting;

    public CreatePost(){
        PageFactory.initElements(driver,this);
    }
    public void CreatingAPost(){
        create.sendKeys("Hey Guyss.....Hello....How are you all?...");
        posting.click();
    }

}
