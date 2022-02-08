package com.emaxlandmarkdigital.mobiletests.utilities;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        strict = true,
        //tags = {"@sanity"},
        monochrome = true,
        features = "src/test/resources",
        glue = {"com.emaxlandmarkdigital.mobiletests.steps"},
        plugin = {("json:target/cucumber-reports/cucumberTestReport.json"),
                ("html:target/cucumber-reports/cucumberTestReport.html")}

)

public class RunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {return super.scenarios();}
}
