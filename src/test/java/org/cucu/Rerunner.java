package org.cucu;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun\\run.txt",
glue = "org.step",dryRun = false,strict = true, snippets = SnippetType.UNDERSCORE,tags= {"@tag1"},
plugin = {"pretty",
		"rerun:C:\\Users\\psjey\\eclipse-workspace\\cucumberframe\\rerun\\run.txt"})

public class Rerunner {

}