package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReviewPage {
    private WebDriver driver;
    public ReviewPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By questionTitleElement = By.xpath("/html/body/div[1]/div/div[1]/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/span");


    public String getQuestionTitle() {

        return driver.findElement(questionTitleElement).getText();

    }
}

