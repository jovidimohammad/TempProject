package com.cybertek.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//to get failures in rerun
@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt",
        glue = "com/cybertek/step_definitions"
)

public class FailedTests {
}
