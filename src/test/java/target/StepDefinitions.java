package target;

import com.joantolos.cucumber.Target;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * Created by jtolos on 23/02/2015.
 */
public class StepDefinitions {

    private Target target;
    private int jumpingRepetitions;

    @Given("^My target has (\\d+) as a molecular weight$")
    public void my_target_has_as_a_molecular_weight(int molecularWeight) throws Throwable {
        this.target = new Target(molecularWeight);
    }

    @When("^I jump (\\d+) time$")
    public void i_jump_time(int jumpingRepetitions) throws Throwable {
        this.jumpingRepetitions = jumpingRepetitions;
    }

    @Then("^my target should (.*)$")
    public void my_target_should_be_a_big_target(String expectedSize) throws Throwable {
        String targetSize = target.getTargetSize(this.jumpingRepetitions);
        assertThat(targetSize, is(expectedSize));
    }

    @Given("^David Target weights (\\d+)$")
    public void david_Target_weights(int molecularWeight) throws Throwable {
        this.target = new Target(molecularWeight);
    }

    @When("^David jumps (\\d+) times$")
    public void david_jumps_times(int jumpingRepetitions) throws Throwable {
        this.jumpingRepetitions = jumpingRepetitions;
    }

    @Then("^his target should (.*)$")
    public void his_target_should_be_a_big_target(String expectedSize) throws Throwable {
        String targetSize = target.getTargetSize(this.jumpingRepetitions);
        assertThat(targetSize, is(expectedSize));
    }
}
