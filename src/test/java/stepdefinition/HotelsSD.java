package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHPage;
import framework.webPages.HotelsResultPg;
import org.testng.Assert;


public class HotelsSD {
    HotelsHPage hPage = new HotelsHPage();
    HotelsResultPg resultpg = new HotelsResultPg();

    @Given("^I am on default locations search result screen$")
    public void resultScreenVerify(){
        hPage.clickOnAddClose();
        hPage.sendtextDestination("New York, New York, United States Of America");
        hPage.clickOnFirstChoice();
        hPage.clickOnSearch();
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Hotels.com - hotels in New York, New York, United States Of America");

        resultpg.maximizeWindow();

        }
        @When("^I select property class (.+)$")
    public void starSelect (String stars){


            switch (stars) {

                case  "5stars":
                    resultpg.clickFiveStar();

                    break;
                case "4stars":

                    resultpg.clickOnFourStar();
                    break;
                case  "3stars":

                    resultpg.clickOnThreeStar();

                    break;


            }



        }
        @Then("^I verify system displays only (.+) hotels on search result$")
        public void verifyStars (String Stars) throws InterruptedException {

        switch (Stars){
            case"5stars":
                resultpg.getList(resultpg.getContainsText5());
                resultpg.starsAssertion("5");


                break;
            case"4stars":
                resultpg.getList(resultpg.getContainsText4());
                resultpg.starsAssertion("4");


                break;
            case"3stars":
                resultpg.getList(resultpg.getContainsText3());
                resultpg.starsAssertion("3");


                break;

        }

        }
        @Then("^I verify system displays all hotels within 10 miles radius of airport$")
        public void verifyDistance(){
        resultpg.distanceCheck();

        }

        @Then("^I verify Hilton Hotel is within radius$")
        public void veriyHilton(){
        resultpg.hiltonCheck();
        }
}
