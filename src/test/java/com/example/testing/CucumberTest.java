package com.example.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.example.testing",
        format = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
