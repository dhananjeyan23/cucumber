package org.cucu;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\psjey\\eclipse-workspace\\cucumberframe\\src\\test\\resources\\Features\\fblogin.feature",
glue = "org.step",dryRun = false,strict = true, snippets = SnippetType.UNDERSCORE,tags= {"@tag2"},
plugin = {"pretty",
		"html:C:\\Users\\psjey\\eclipse-workspace\\cucumberframe\\AllReports\\Html",
		"json:C:\\Users\\psjey\\eclipse-workspace\\cucumberframe\\AllReports\\Json\\fb.json ",
		"juint:C:\\Users\\psjey\\eclipse-workspace\\cucumberframe\\AllReports\\Junit\\fbook.xml"})

public class RunnerClass {

}
