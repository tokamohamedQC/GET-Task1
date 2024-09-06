import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegisrationPage {
    Random random = new Random();
    int rand = random.nextInt(100000);

    public WebElement FirstNameInput(WebDriver driver){
        By FN_input = By.id("firstname");
        WebElement FN_InputElement = driver.findElement(FN_input);
        return FN_InputElement;
    }

    public WebElement LastNameInput(WebDriver driver){
        By LN_input = By.id("last_name");
        WebElement LN_InputElement = driver.findElement(LN_input);
        return LN_InputElement;
    }

    public WebElement CountryInput(WebDriver driver){
        By Code_input = By.xpath("//div[text()=\"Select Country\"]");
        WebElement CountryCodeElement = driver.findElement(Code_input);
        return CountryCodeElement;
    }

    public WebElement CountryCode(WebDriver driver){
//        By Code_input = By.xpath("//select");
        By Code_input = By.xpath("//input[@type=\"search\"]");
        WebElement CountryCodeElement = driver.findElement(Code_input);
        return CountryCodeElement;
    }

    public WebElement Country(WebDriver driver){
        By Egypt_code = By.xpath("//span[@class=\"text\"]");
        WebElement CodeElement = driver.findElement(Egypt_code);
        return CodeElement;
    }

    public WebElement PhoneInput(WebDriver driver){
        By phone_input = By.id("phone");
        WebElement phone_InputElement = driver.findElement(phone_input);
        return phone_InputElement;
    }

    public WebElement EmailInput(WebDriver driver){
        By email_input = By.id("user_email");
        WebElement email_InputElement = driver.findElement(email_input);
        return email_InputElement;
    }

    public WebElement PasswordInput(WebDriver driver){
        By password_input = By.id("password");
        WebElement password_InputElement = driver.findElement(password_input);
        return password_InputElement;
    }

    public WebElement captchaCheckbox (WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,10);
        By captcha_checkbox = By.xpath("//div[@class=\"recaptcha-checkbox-border\"]");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title=\"reCAPTCHA\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(captcha_checkbox));
        WebElement Captcha = driver.findElement(captcha_checkbox);
        return Captcha;
    }

    public WebElement SignUpButton (WebDriver driver){
        By signup_button = By.id("submitBTN");
        WebElement signup = driver.findElement(signup_button);
        return signup;
    }

    public void FirstNameInputText(WebDriver driver, String text){
        FirstNameInput(driver).sendKeys(text);
    }

    public void LastNameInputText(WebDriver driver, String text){
        LastNameInput(driver).sendKeys(text);
    }

    public void SelectCountry(WebDriver driver, String text){
//        Select select = new Select(CountryCode(driver));
//        select.selectByValue("63");
          CountryCode(driver).sendKeys("+" + text);
    }

    public void PhoneInputText(WebDriver driver, String text){
        PhoneInput(driver).sendKeys(text);
    }

    public void EmailInputText(WebDriver driver, String text){
        EmailInput(driver).sendKeys(text + rand +".com");
    }

    public void PasswordInputText(WebDriver driver, String text){
        PasswordInput(driver).sendKeys(text);
    }

    public void clickCountry(WebDriver driver){
        Country(driver).click();
    }

    public void clickCaptcha(WebDriver driver){
        captchaCheckbox(driver).click();
    }

    public void clickSignup(WebDriver driver){
        SignUpButton(driver).click();
    }


}
