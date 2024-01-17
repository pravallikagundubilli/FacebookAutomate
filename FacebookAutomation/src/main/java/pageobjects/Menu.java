package pageobjects;

import Basetest.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu extends BaseClass {


    @FindBy(xpath = "//*[@aria-label='Your profile']")
    WebElement profile;
    //WebElement logout = driver.findElement(By.name("Log Out"));

    //@FindBy(xpath = "//*[text()='Post']")
    //WebElement post;

    @FindBy(xpath="//*[@aria-label='Menu']")
    WebElement menu;

    //@FindBy(xpath="//*[@aria-current='page' and @aria-label='Home']")
    //WebElement home;

    @FindBy(xpath="//*[aria-label='Messenger']")
    WebElement message;
    @FindBy(xpath="//*[@text()='Story']")
    WebElement story;
    //@FindBy(xpath="//*[text()='What's on your mind, Pravallika?']")
    //WebElement whatsonmind;

   //@FindBy(xpath="//*[@text()='See all profiles']")
   //WebElement seeprof;

   public Menu(){

     PageFactory.initElements(driver,this);
   }
   public void CreateaPost() throws Exception{

       profile.click();
      // logout.click();

       menu.click();

       message.click();
       //post.click();
       story.click();
       //home.click();

       //whatsonmind.click();
   }
}
