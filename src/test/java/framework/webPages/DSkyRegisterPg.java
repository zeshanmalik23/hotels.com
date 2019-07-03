package framework.webPages;

import org.openqa.selenium.By;

public class DSkyRegisterPg extends BasePage {
    DSkyHPage dSkyHPage = new DSkyHPage();

    private By registerButton = By.xpath("//button[contains(text(),'Register')]");

    public void clickonRegisterButton(){
        clickOn(registerButton);
    }



}
