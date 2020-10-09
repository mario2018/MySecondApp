package com.example.mysecondapp;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UseVote {
    @Given("{int} participants, everyone votes {int}")
    public void participants_everyone_votes(Integer p, Integer v) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("participants finish voting$")
    public void participants_finish_voting() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("total votes should be {int}")
    public void total_votes_should_be(Integer v) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
