package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TechGloBasePage;
import pages.TechGlo_FrontEndPage;
import pages.TechGlo_LoginFormPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TechGloBase {

    WebDriver driver;
    TechGloBasePage techGloBasePage;
    TechGlo_FrontEndPage techGlo_frontEndPage;
    TechGlo_LoginFormPage techGlo_loginFormPage;

    @BeforeMethod
    public void setup() {

        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        techGloBasePage = new TechGloBasePage();
        techGlo_frontEndPage = new TechGlo_FrontEndPage();
        techGlo_loginFormPage = new TechGlo_LoginFormPage();

        techGlo_frontEndPage.getFrondEndPage();
        techGlo_frontEndPage.clickOnCard(15 );
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}