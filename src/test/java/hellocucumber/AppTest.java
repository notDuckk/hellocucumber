package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/is_it_friday_yet.feature", // Path to the specific feature file
        glue = {"steps"}, // Package where step definitions are located
        plugin = {"pretty"} // This makes the output prettier :D
)
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
