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
        factory=new appFactory();
        page=new SignUpPage();
        appFactory.initialize();
        }
    @Test
    public void createAccount() {
        page.continue_email_btn();
        page.enterEmail();
        page.enterPass();

        }
    @AfterTest
    public void tearDown() {
       appFactory.quitDriver();
        }
        }