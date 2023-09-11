package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {


    private final SelenideElement
            mainSearch = $("div.header-search"),
            mainSearchTerm = $(".header-search__term"),
            cookieConsent = $(".cookie-consent__button"),
            languageIcon = $(".header__lang-switcher"),

            searchIcon = $(".header-search__search-btn"),
            searchField = $("#search-term-header"),

            footerPosition = $(".footer__top");




    public void openPage() {
        open("");
    }

    public void clickCookieConsent(String acceptcookie) {
        cookieConsent.find(byText(acceptcookie)).click();
    }

    public void searchFromMainPage(String search) {
        mainSearch.click();
        mainSearchTerm.click();
        mainSearchTerm.setValue(search).pressEnter();
    }

    public MainPage clickSwitchLanguageIcon() {
        languageIcon.click();
        return this;

    }

    public MainPage searchIconClick() {
        searchIcon.click();
        return this;

    }

    public MainPage setValueOnSearchField(String value) {
        searchField.sendKeys(value);
        return this;

    }

    public MainPage scrollToFooter() {
        footerPosition.scrollIntoView(true);
        return this;

    }

    public MainPage footerAddressCheck(String value) {
        footerPosition.shouldHave(text(value));
        return this;

    }

    public MainPage clickOnText(String tab) {
        $(byText(tab)).click();
        return this;

    }

}