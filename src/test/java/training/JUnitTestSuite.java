package training;

/**
 * 6/2/2016.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import training.model.UserTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AppTest.class,
        AppConfigTest.class,
        UserTest.class
})


public class JUnitTestSuite {
}