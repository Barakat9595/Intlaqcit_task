package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By userNameField = By.id("input-12");
    private By passwdField = By.id("input-17");
    private By signInBtn = By.xpath("//form[@class='v-form']/div[2]/button[1]");

    public void enterUserName(String userName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement userNameFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));

        userNameFieldElement.sendKeys(userName);
    }

    public void enterPasswd(String passwd)
    {
        driver.findElement(passwdField).sendKeys(passwd);
    }
    public HomePage clickSignIn()
    {
        driver.findElement(signInBtn).click();
        return new HomePage(driver); // click + return -> new page(home page)
    }



}
