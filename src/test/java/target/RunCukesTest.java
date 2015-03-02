package target;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *  
 * Created by jtolos on 23/02/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty",
        "html:target/html/target",
        "json:target/json/cucumber.json",
        "junit:target/junit/cucumber.xml"})
public class RunCukesTest {
    
}
