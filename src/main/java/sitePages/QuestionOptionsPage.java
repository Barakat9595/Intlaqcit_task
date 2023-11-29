package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuestionOptionsPage {
    private WebDriver driver;
    public QuestionOptionsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By addQuestionBtn = By.xpath("//*[@id=\"applications\"]/div/span[1]");
    public NewQuestionPage addQuestion() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement addQuestionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(addQuestionBtn));


        addQuestionElement.click();


        return new NewQuestionPage(driver);
    }
}
