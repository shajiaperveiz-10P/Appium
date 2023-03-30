package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUpPage {
public SignUpPage() {
    PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);
}
        @FindBy(id ="com.booking: id/identity_landing_social_button")
        public WebElement continue_Email;
        @FindBy (id = "com,booking:id/identity_text_input_edit_text")
        public WebElement email_address;
        @FindBy (id ="com.booking id/identity_text_input_edit_text")
public WebElement pass;

public void continue_email_btn()

    {
        continue_Email.click();
    }
public void enterEmail() {
    email_address.sendKeys("training4@gmail.com");
}

public void enterPass() {
    pass.sendKeys("Testing@1234");
}
}
