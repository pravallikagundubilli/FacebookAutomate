import Basetest.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.Userlogin;
import pageobjects.*;
public class LoginAutomate extends BaseClass {
    @BeforeMethod
    public void sign() throws Exception {

        launchBrowser();
        //User Login Page
        Userlogin ul=new Userlogin();
        ul.signinpage();
}
    @Test
    public void SendInvitationMail()
    {
        System.out.println(driver.getCurrentUrl());
    }
}
