package framework.webPages;

import org.apache.velocity.runtime.directive.Parse;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HotelsResultPg extends BasePage {
    private By fiveStars = By.id("f-star-rating-5");
    private By fourStars = By.id("f-star-rating-4");
    private By threeStars= By.id("f-star-rating-3");


    private By containsText5 = By.xpath("//div[@class='additional-details resp-module']//span[contains(text(),'5')]");
    private By containsText4 = By.xpath("//div[@class='additional-details resp-module']//span[contains(text(),'4')]");
    private By containsText3 = By.xpath("//div[@class='additional-details resp-module']//span[contains(text(),'3')]");
    private By distanceToPlace = By.xpath("//li[contains(text(),'to Times Square')]");
    private By hotelName = By.xpath("//a[@class='property-name-link']");


    public By getContainsText5() {
        return containsText5;
    }

    public By getContainsText4() {
        return containsText4;
    }

    public By getContainsText3() {
        return containsText3;
    }



    JavascriptExecutor js = (JavascriptExecutor) SharedSD.getDriver();
    public void clickFiveStar(){
        clickOn(fiveStars);
    }
    public void clickOnFourStar(){

        clickOn(fourStars);
    }
    public void clickOnThreeStar(){

        clickOn(threeStars);
    }
    public void maximizeWindow(){
        maxWindow();

    }

    String strElement;
//    static List<String> stringList = new ArrayList<>();
    public void getList(By element) throws InterruptedException {
        List<WebElement> starslist = SharedSD.getDriver().findElements(element);
//        stringList = new ArrayList<>();
        for (int i =0; i<10;i++){
            js.executeScript("window.scrollBy(0,900)");
            Thread.sleep(3000);
        }
        for (WebElement e: starslist){
             strElement = e.getText().substring(0,1);
//            stringList.add(strElement);

        }
    }
    public void starsAssertion(String stars){
        boolean check = false;
        if (strElement.contains(stars)){check=true;}
    }

    float floatDistance;


    public void distanceCheck(){
        List<WebElement> distanceList = SharedSD.getDriver().findElements(distanceToPlace);
        for(WebElement e : distanceList) {
        String getString = e.getText().substring(0,3);
        floatDistance = Float.parseFloat(getString);


        }
        System.out.println(floatDistance);
        boolean distance = false;
        if (floatDistance<10.00){distance=true;}
        Assert.assertTrue(distance);
    }
    String strList;
    public void hiltonCheck(){
        List<WebElement> hotels = SharedSD.getDriver().findElements(hotelName);
        for (WebElement e : hotels){
            strList = e.getText();
        }boolean hTest = false;
        if (strList.contains("hilton")){
            hTest=true;
        }
        Assert.assertTrue(hTest);

    }

}
