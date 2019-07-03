package framework.webPages;

import org.openqa.selenium.By;

public class MessengerLoginPage extends BasePage{

    private By errorMessage = By.xpath("//div[@class='_3403 _3404']");

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
