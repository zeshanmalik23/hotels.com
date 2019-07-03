package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DSkyHPage;
import framework.webPages.DSkyRegisterPg;
import org.testng.Assert;

public class DSkySD {
    DSkyHPage dSkyHPage = new DSkyHPage();
    DSkyRegisterPg dSkyRegisterPg = new DSkyRegisterPg();

    @Given("^i am on darksky homepage$")
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY", "invalid homepage");
    }

    @When("^I am on the darksky Register page$")
    public void iAmOnRegPage() {
        dSkyHPage.clickOnApi();
        dSkyHPage.clickOnSignUp();
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://darksky.net/dev/register", "invalid page");
    }

    @When("^I click on Register button$")
    public void clickOnRegisterBtn() {
        dSkyRegisterPg.clickonRegisterButton();
    }

    @Then("^I verify current URL$")
    public void verifyURL() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://darksky.net/dev/register");
    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void compareTem() {
        dSkyHPage.checkTempValue();
    }

    @When("^I expand todays timeline$")
    public void expandIcon1() throws InterruptedException {


        dSkyHPage.expandIcon1();

    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void compareEquality() {
        dSkyHPage.compareEquality();
    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void checkHoursIncrement(){
        dSkyHPage.checkHourDiff();
    }
}