import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class OpenBrowser extends SetUp{
    RelatedActions relatedActions = new RelatedActions();
    @Test
    public void ValidScenario() throws Exception {
        registration.FirstNameInputText(driver, relatedActions.readStringFile(1,0));
        registration.LastNameInputText(driver, relatedActions.readStringFile(2,0));
        registration.CountryInput(driver).click();
        registration.SelectCountry(driver, relatedActions.readNumericFiled(3, 0));
        registration.clickCountry(driver);
        registration.PhoneInputText(driver, relatedActions.readNumericFiled(4,0));
        registration.EmailInputText(driver, relatedActions.readStringFile(5,0));
        registration.PasswordInputText(driver, relatedActions.readStringFile(6,0));
        registration.clickCaptcha(driver);
        registration.clickSignup(driver);

    }

}
