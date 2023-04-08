import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


/**
 * Варинаты запуска сценариев:
 * Команда  в консоли
 * Через UI intellij IDEA в scenario.feature
 */
public class IviPageObjectsTest {

    private final String BACK_BUTTON = "Назад";
    private final SelenideElement
            searchInput = $("[data-test=header_search]"),
            searchMovieInput = $(".nbl-input__editbox"),
            openMovieInput = $("a[href=\"https://www.ivi.ru/watch/90324\"]"),
            checkMovieInput = $(".contentCard__info"),
            clickFavoritesInput = $("button[data-test=favorite_button]"),
            openFavoritesInput = $("a[href=\"/profile/favorites\"]"),
            favoritesCheckMovieInput = $(".gallery__item"),
            avatarInput = $("[data-test=header_avatar]"),
            emailEnterInput = $("[data-test=input_login]");

    public void openUrl(String url){
        Selenide.open(url);
    }
    public void removeAd() {
        $(byText(BACK_BUTTON)).click();
    }

    public void openSearch() {
        searchInput.click();
    }

    public void openMovie(String movie) {
        searchMovieInput.setValue(movie).pressEnter();
        openMovieInput.click();
    }

    public void checkMovie(String checkMovie) {
        checkMovieInput.shouldHave(text(checkMovie));
    }

    public void clickFavorites() {
        clickFavoritesInput.click();
    }

    public void openFavorites() {
        openFavoritesInput.click();
    }

    public void favoritesCheckMovie(String film) {
        favoritesCheckMovieInput.shouldHave(text(film));
    }
    public void avatar(){
        avatarInput.hover();
    }
    public void clickEnter(String enter){
        $(byText(enter)).click();
    }
    public void emailEnter(String email){
        emailEnterInput.setValue(email).pressEnter();
    }
    public void errorMessage(String error){
        $(Selectors.withText(error)).should(Condition.exist);
    }
}
