package stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\Selenium WorkSpace\\CucumberDemo4\\Feature456\\mtest9999.feature",glue="mytestTestMeApp",plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})

public class My4thRunnerClass {

}
