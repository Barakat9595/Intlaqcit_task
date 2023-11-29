package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class NewQuestionPage {
    private WebDriver driver;
    public NewQuestionPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By order = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[1]/div/div/div/div[1]/div/div/div[1]/div[1]/div[1]");
    private By option = By.xpath("//*[@id=\"list-item-177-0\"]/div");

    private By orderCreator = By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div/form/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/div[1]/input[1]");

    private By orderCreatorName = By.xpath("//*[@id=\"input-310\"]");
    private By organizationField = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]");
    private By departmentField = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[1]");
    private By sortField = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[5]/div/div/div[1]");
    private By date = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[2]/div[5]/div[1]/div/div[1]");
    private By nextMonthArrow = By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[1]/button[2]/span");
    private By choosingDay = By.xpath("//*[@id=\"app\"]/div[7]/div/div/div/div[2]/table/tbody/tr[1]/td[7]");
    private By choosingDrugField = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]");
    private By activeDrugField = By.xpath("/html/body/div[1]/div/div[1]/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/input");

    private By questionTitleField = By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[3]/div/div/div/div[1]/div[1]/input");
    private By questionField = By.xpath("/html/body/div[1]/div/div/main/div/div/div[2]/div/div/div/form/div/div/div[3]/div/div/div[4]/div/div/div/div[1]/div[1]/textarea");
    private By submitQuestionBtn = By.xpath("//*[@id=\"AppsContent\"]/div/div/div/div/div[1]/button");


    public void openOrderList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement orderElement = wait.until(ExpectedConditions.visibilityOfElementLocated(order));
        orderElement.click();
    }

    public void selectOptionInDropdown(String optionText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(order));

        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownElement).perform();

        By optionLocator = By.xpath("//div[contains(text(), '" + optionText + "')]");
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
        optionElement.click();
    }


    public void activateOrderCreator()
    {
        driver.findElement(orderCreator).click();
    }

    public void enterOrderCreator(String name) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement orderCreatorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(orderCreator));

        orderCreatorElement.sendKeys(name);
    }

    public void navigateToAutocompleteOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement orderCreatorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(orderCreator));

        orderCreatorElement.sendKeys(Keys.ARROW_DOWN);
    }

    public void chooseAutocompleteOption() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement orderCreatorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(orderCreator));

        orderCreatorElement.sendKeys(Keys.ENTER);
    }



    public void openOrganizationList() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement organizationFieldElement = wait.until(ExpectedConditions.elementToBeClickable(organizationField));


        organizationFieldElement.click();
    }
    public void chooseOrganization(String optionText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(organizationField));


        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownElement).perform();


        By optionLocator = By.xpath("//div[contains(text(), '" + optionText + "')]");
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));

        optionElement.click();
    }
    public void openDeptList()
    {
        driver.findElement(departmentField).click();
    }
    public void chooseDept(String optionText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(departmentField));


        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownElement).perform();

        By optionLocator = By.xpath("//div[contains(text(), '" + optionText + "')]");
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));


        optionElement.click();
    }

    public void openSortMenu()
    {
        driver.findElement(sortField).click();
    }
    public void chooseSortType(String optionText)
    {
        WebElement dropdownElement = driver.findElement(sortField);

        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownElement).perform();

        By optionLocator = By.xpath("//div[contains(text(), '" + optionText + "')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();

    }
    public void openDateMenu()
    {
        driver.findElement(date).click();
    }
    public void navigateToNextMonth()
    {
        driver.findElement(nextMonthArrow).click();
    }
    public void chooseDay()
    {
        driver.findElement(choosingDay).click();
    }

    public void scrollDown() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
   //drug autocomplete methods
   public void activateDrugMenu() {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       WebElement choosingDrugFieldElement = wait.until(ExpectedConditions.elementToBeClickable(choosingDrugField));

       choosingDrugFieldElement.click();
   }

    public void enterDrug(String drug) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement activeDrugFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(activeDrugField));
        activeDrugFieldElement.sendKeys(drug);
    }

    public void navigateToDrugAutocomplete() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement activeDrugFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(activeDrugField));

        activeDrugFieldElement.sendKeys(Keys.ARROW_DOWN);
    }

    public void chooseDrugAutocompleteOption() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement activeDrugFieldElement = wait.until(ExpectedConditions.elementToBeClickable(activeDrugField));

        activeDrugFieldElement.sendKeys(Keys.ENTER);
    }
    public void escape(){driver.findElement(activeDrugField).sendKeys(Keys.ESCAPE);}

    public void enterQuestionTitle(String title)
    {
        driver.findElement(questionTitleField).sendKeys(title);
    }

    public void enterQuestion(String question)
    {
        driver.findElement(questionField).sendKeys(question);
    }
    public ReviewPage submitQuestion() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement submitQuestionElement = wait.until(ExpectedConditions.elementToBeClickable(submitQuestionBtn));


         submitQuestionElement.click();
         return new ReviewPage(driver);
    }
    public Boolean isMandatoryFieldsEntered()
    {
        return driver.findElement(submitQuestionBtn).isEnabled();
    }






}
