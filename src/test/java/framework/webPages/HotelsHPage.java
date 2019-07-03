package framework.webPages;

import org.openqa.selenium.By;

public class HotelsHPage extends BasePage {

    private By searchBtn = By.xpath("//button[@class='cta cta-strong']");
    private By addPath = By.xpath("//button[@class='cta widget-overlay-close']");
    private By destination = By.id("qf-0q-destination");
    private By firstChoice = By.id("citysqm-asi0-s0");
//    private By firstChoice = By.xpath("//tr[@id='citysqm-asi0-s0']//td");
    private By smallAdd = By.xpath("//span[@class='close-icon po-a cursor c-hds-arch-1 x-s']");

    public void clickOnSearch(){
        clickOn(searchBtn);
    }
    public void clickOnAddClose (){
        if(isElementDisplayed(addPath)){clickOn(addPath);}
        if (isElementDisplayed(smallAdd)){clickOn(smallAdd);}

    }
    public void sendtextDestination (String text){
        sendKeys(destination,text);
    }
    public void clickOnFirstChoice(){
        clickOn(firstChoice);
    }
}
