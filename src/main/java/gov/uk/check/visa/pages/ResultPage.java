package gov.uk.check.visa.pages;


import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ResultPage extends Utility {
/*4..ResultPage - resultMessage locator and create methods 'String getResultMessage()' and
'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
* */


    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement  result;

    public  String getResultMessage(){
        Reporter.log("get Result and verify " + result.toString());
        return getTextFromElement(result);
    }
}
