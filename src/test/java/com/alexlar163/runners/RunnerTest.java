package com.alexlar163.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com.alexlar163.stepdefs",
        tags = "@menu_redirect_to_all_items_test"
)
public class RunnerTest {
}
