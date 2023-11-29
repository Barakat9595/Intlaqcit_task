package E2EScenario;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sitePages.HomePage;
import sitePages.NewQuestionPage;
import sitePages.QuestionOptionsPage;
import sitePages.ReviewPage;

public class e2eScenario extends BaseTest {
    @Test
    public void testEndToEnd() throws InterruptedException {
        loginPage.enterUserName("BrkatTest5");
        loginPage.enterPasswd("BrkatTest5@123");


        HomePage homePage = loginPage.clickSignIn();

       QuestionOptionsPage questionOptionsPage = homePage.openQuestionsData();
       NewQuestionPage newQuestionPage = questionOptionsPage.addQuestion();
        newQuestionPage.openOrderList();

        newQuestionPage.selectOptionInDropdown("Ibn-Sina");
        newQuestionPage.activateOrderCreator();
         newQuestionPage.enterOrderCreator("Hamd Mahmooud Ahmed");
        newQuestionPage.navigateToAutocompleteOption();
        newQuestionPage.chooseAutocompleteOption();
        Thread.sleep(3000);

        newQuestionPage.openOrganizationList();
        newQuestionPage.chooseOrganization("مركز الجهاز الهضمى");
        newQuestionPage.openDeptList();

        newQuestionPage.chooseDept("القسم الداخلى");
        Thread.sleep(4000);
        newQuestionPage.openSortMenu();
        newQuestionPage.chooseSortType("اداريا");
        Thread.sleep(4000);
        newQuestionPage.openDateMenu();
        Thread.sleep(2000);
        newQuestionPage.navigateToNextMonth();
        Thread.sleep(2000);
        newQuestionPage.chooseDay();
        Thread.sleep(3000);
        newQuestionPage.scrollDown();
        Thread.sleep(3000);
        newQuestionPage.activateDrugMenu();
        newQuestionPage.enterDrug("novaldol");
        newQuestionPage.navigateToDrugAutocomplete();
        newQuestionPage.chooseDrugAutocompleteOption();
        newQuestionPage.escape();
     Thread.sleep(3000);
        newQuestionPage.enterQuestionTitle("new question title");
        newQuestionPage.enterQuestion("question");
        newQuestionPage.scrollDown();
        // Boolean isBtnEnabled = newQuestionPage.isMandatoryFieldsEntered(); //to check every mandatory field is not empty
      //  Thread.sleep(4000);
        //Assert.assertEquals(isBtnEnabled,Boolean.TRUE);
        ReviewPage reviewPage = newQuestionPage.submitQuestion();
        Thread.sleep(5000);
        String questionTitleAssertionText = reviewPage.getQuestionTitle();
        Thread.sleep(4000);
        Assert.assertEquals(questionTitleAssertionText,"new question title");





    }

}
