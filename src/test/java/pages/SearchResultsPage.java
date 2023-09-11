package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    private final SelenideElement

            searchResultsList = $(".search-results__list"),
            searchFormClearBtn = $(".search-form__clear-btn"),
            searchFormTerm = $(".search-form__term"),
            searchType = $(".search-form__type-cnt"),
            searchFormButtons = $("div.search-form__buttons"),
            searchResults = $(".search-results__content-section"),
            searchResultTitle = $(".search-results-header__title"),
            headerLogo = $(".header__logo");


    public void checkSearch(String textSearch) {
        searchResultsList.shouldHave(text(textSearch));
    }

    public void searchFromResultPage(String fromResult) {
        searchFormClearBtn.click();
        searchFormTerm.setValue(fromResult);
    }
    public SearchResultsPage checkTitleOnSearchResult(String value) {
        searchResultTitle.shouldHave(text(value));
        return this;

    }
    public SearchResultsPage searchResultIsNotEmpty() {
        searchResults.shouldNotBe(empty);
        return this;

    }
    public void searchFromResultPageView(String view) {
        searchType.find(byText(view)).click();
    }

    public void searchResult(String buttonFind) {
        searchFormButtons.find(byText(buttonFind)).click();
    }

    public void goToMainPage() {
        headerLogo.click();
    }
}