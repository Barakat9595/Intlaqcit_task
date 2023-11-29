package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By questionsDataBtn = By.xpath("//div[@id='subsystems']/div/div/div/div[2]/a");

    public QuestionOptionsPage openQuestionsData() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement questionsDataElement = wait.until(ExpectedConditions.visibilityOfElementLocated(questionsDataBtn));


        questionsDataElement.click();


        return new QuestionOptionsPage(driver);
    }

}
