package framework.webPages;

import org.glassfish.grizzly.http.server.util.SimpleDateFormats;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.*;

public class DSkyHPage extends BasePage {
    //locators
    private By apiButton = By.linkText("Dark Sky API");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By currentTemp = By.xpath("//span[@class='summary swap']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By expandIcon1 = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1]");
    private By topLowTemp = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
    private By topHighTemp = By.xpath("//a[@class='day revealed']//*[@class='maxTemp']");
    private By belowLowTemp =By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//span[@class='temp']");
    private By belowHighTemp = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']//span[@class='temp']");
    private By webHours = By.xpath("//div[@class='hours']//*[contains(text(),'m' )]");

    //methods
    public void clickOnApi(){
        clickOn(apiButton);
    }
    public void clickOnSignUp(){
        clickOn(signUpButton);
    }
    public void checkTempValue(){
        String currentTS = getTextFromElement(currentTemp);
        int currentTempInt = Integer.parseInt(currentTS.substring(0,2));

        List<WebElement> tempList = SharedSD.getDriver().findElements(By.xpath("//span[contains(text(),'°')]"));
        List<Integer> intTemp = new ArrayList<>();
        for (WebElement e:tempList ){
            String tempStr = e.getText().substring(0, e.getText().length()-1);
            intTemp.add(Integer.valueOf(tempStr));


        }
        Collections.sort(intTemp);
        System.out.println(intTemp);
        int lowTemp = intTemp.get(0);
        int HighTemp = intTemp.get(intTemp.size()-1);

        boolean includes = true;
        if (currentTempInt<lowTemp|| currentTempInt > HighTemp){includes=false;}
        Assert.assertTrue(includes);




    }


        public void expandIcon1() throws InterruptedException {
            SharedSD.getDriver().manage().window().maximize();
            JavascriptExecutor js =(JavascriptExecutor) SharedSD.getDriver();
            js.executeScript("window.scrollBy(0,600)");
            Thread.sleep(5000);

           clickOn(expandIcon1);

        }
        public void compareEquality(){
           String tLowTemp = getTextFromElement(topLowTemp);
           String tHighTemp = getTextFromElement(topHighTemp);
           String bLowTemp = getTextFromElement(belowLowTemp);
           String bHighTemp = getTextFromElement(belowHighTemp);
           Assert.assertTrue(tLowTemp.contains(bLowTemp));
           Assert.assertTrue(tHighTemp.contains(bHighTemp));

        }

        public void checkHourDiff(){
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        Calendar cal = Calendar.getInstance();
        List<String> systemHours = new ArrayList<>();
        List<WebElement> webTime = SharedSD.getDriver().findElements(webHours);
        List<String> strWebtime = new ArrayList<>();
        for (WebElement e : webTime){
            String text = e.getText().toUpperCase();
            strWebtime.add(text);
        }

        for(int i = 0;i < 11; i++){
            cal.add(Calendar.HOUR,2);
            String systemString = sdf.format(cal.getTime());
            systemHours.add(systemString);

        }
            System.out.println(strWebtime);
            System.out.println(systemHours);

        Assert.assertEquals(systemHours,strWebtime);

        }




    }

