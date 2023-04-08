import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ivi {
    IviPageObjectsTest iviPageObjectsTest = new IviPageObjectsTest();

    @Given("url ivi {string}")
    public void url_ivi(String ivi) {
        iviPageObjectsTest.openUrl(ivi);
    }

    @When("website is open close the ad")
    public void website_is_open_close_the_ad() {
        iviPageObjectsTest.removeAd();
    }

    @Then("click on search")
    public void click_on_search() {
        iviPageObjectsTest.openSearch();
    }

    @Then("find a movie {string}")
    public void find_a_movie(String movie) {
        iviPageObjectsTest.openMovie(movie);
    }

    @Then("check an open movie {string}")
    public void check_an_open_movie(String checkMovie) {
        iviPageObjectsTest.checkMovie(checkMovie);
    }

    @Then("add a movie to favorites")
    public void add_a_movie_to_favorites() {
        iviPageObjectsTest.clickFavorites();
    }

    @Then("go to the favorites list")
    public void go_to_the_favorites_list() {
       iviPageObjectsTest.openFavorites();
    }

    @Then("find a movie in favorites {string}")
    public void find_a_movie_in_favorites(String film) {
        iviPageObjectsTest.favoritesCheckMovie(film);
    }

    @Then("hover the mouse over the avatar")
    public void hover_the_mouse_over_the_avatar() {
iviPageObjectsTest.avatar();    }

    @Then("click on {string}")
    public void click_on(String enter) {
        iviPageObjectsTest.clickEnter(enter);
    }

    @Then("enter in the field {string}")
    public void enter_in_the_field(String email) {
       iviPageObjectsTest.emailEnter(email);
    }

    @Then("a message appeared {string}")
    public void a_message_appeared(String error) {
        iviPageObjectsTest.errorMessage(error);
    }

}
