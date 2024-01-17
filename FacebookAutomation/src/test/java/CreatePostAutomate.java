import Basetest.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.Menu;
import pageobjects.CreatePost;
import pageobjects.Userlogin;


public class CreatePostAutomate extends BaseClass {

    @BeforeMethod
    public void creating() throws Exception{
        launchBrowser();

        Userlogin ul=new Userlogin();
        ul.signinpage();

        Menu mn=new Menu();
        mn.CreateaPost();

        CreatePost cp=new CreatePost();
        cp.CreatingAPost();

    }
    @Test
    public void invite(){
        System.out.println(driver.getCurrentUrl());
    }

}
