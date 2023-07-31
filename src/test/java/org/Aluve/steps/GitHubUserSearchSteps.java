package org.Aluve.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Aluve.pages.GitHubUserSearch;

import static org.junit.Assert.assertEquals;


public class GitHubUserSearchSteps {
    GitHubUserSearch gitHubUserSearch;

    @Given("I am on the user search page")
    public void iAmOnTheUserSearchPage() {
        gitHubUserSearch.getBySearchBar();
    }

    @Given("I enter the name {string} in the search field")
    public void iEnterTheNameInTheSearchField(String name) {
        gitHubUserSearch.searchUser(name);
    }

    @When("I click the search button")
    public void iClickTheSearchButton() {
        gitHubUserSearch.clickSearchBtn();
    }

    @Then("I should see a list of users with the name {string}")
    public void iShouldSeeAListOfUsersWithTheName(String name) {
        assertEquals(gitHubUserSearch.getByUser(), name);
    }
}
