package tests;
import base.appFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignUpPage;
import java.net.MalformedURLException;

public class signUpTest {
        appFactory factory;
        SignUpPage page;


   @BeforeTest
    public void setup() throws MalformedURLException {
       factory = new appFactory();
       appFactory.initialize();
       page = new SignUpPage();

        }
    @Test
    public void createAccount() throws InterruptedException {
        Thread.sleep(1000);
        page.clickOkBtn();
        page.clickContButton();
        page.enterEmail();
        page.enterPass();

        }
    @AfterTest
    public void tearDown() {
       appFactory.quitDriver();
        }
        }