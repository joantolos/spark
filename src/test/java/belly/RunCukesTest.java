package belly;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *  
 * Created by jtolos on 23/02/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty",
        "html:target/cucumber-html-report/target",
        "json:target_json/cucumber.json",
        "junit:taget_junit/cucumber.xml"})
public class RunCukesTest {
    
}
