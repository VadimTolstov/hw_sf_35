import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features")
public class RunCucumberTest {

    @BeforeAll
    public static void login() {
        Configuration.browserSize = "1920x1080";
    }

}