package Basetest;

import java.time.Duration;
import Utilities.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {
    public static WebDriver driver;
    public static void launchBrowser() throws Exception{
        String browser = ReadPropertyFile.getProperty1("browser");
        String url = ReadPropertyFile.getProperty1("url");
        ChromeOptions coptions = new ChromeOptions();
        coptions.addArguments("--disable-notifications");


        driver = new ChromeDriver(coptions);
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get(url);



    }
}