package tests;
import base.appFactory;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignUpPage;
import utilities.excelFileReader;

import java.net.MalformedURLException;
import java.util.Random;

public class signUpTest {
        appFactory factory;
        SignUpPage page;


   @BeforeTest
    public void setup() throws MalformedURLException {
       factory = new appFactory();
       appFactory.initialize();
       page = new SignUpPage();
       excelFileReader.readExcelFile();

        }
    @Test
    @Epic("Booking.com")
    @Feature("Create account")
    @Description("Signup a user")
    @Severity(SeverityLevel.MINOR)
    
    public void createAccount() throws InterruptedException {
        Thread.sleep(1000);
        page.createAccountButton();
        String enterEmail = excelFileReader.GetCellValue(0, 1);
        String enterPass = excelFileReader.GetCellValue(1,1);
        page.enterEmail ("shajia"+ rand() + enterEmail);
        page.enterPass (enterPass);
        page.clickContButton();

        }

    public int rand () {
        Random r = new Random();
        int x = r.nextInt(900) + 100;
        return x;
    }
    @AfterTest
    public void tearDown() {
       appFactory.quitDriver();
        }
        }