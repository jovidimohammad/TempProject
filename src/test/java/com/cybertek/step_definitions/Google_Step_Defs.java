package com.cybertek.step_definitions;

import com.cybertek.pages.Google_Search_Page;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.When;
import org.junit.Ignore;

import java.sql.Time;
import java.util.Timer;

public class Google_Step_Defs {
    Google_Search_Page search_page = new Google_Search_Page();

    @When("User on google home page")
    public void user_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("User clicks image button")
    public void user_clicks_image_button() throws InterruptedException {
        search_page.images1.click();
        Thread.sleep(3000);//waiting for 3 sec
    }

    @When("User clicks mic button")
    public void user_search_something_on_google() {
        search_page.searchByVoice.click();
    }



//    @When("User should see search result display")
//    public void user_should_see_search_result_display() {
//        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));

    }
