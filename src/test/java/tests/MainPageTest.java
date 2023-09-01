package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("remote")
public class MainPageTest extends TestBase {
    public MainPage mainPage = new MainPage();

    @DisplayName("Проверка смены языка")
    @ParameterizedTest(name = "Language: {0}")
    @MethodSource("switchLanguageOnMainPageData")
    @Test
    public void switchLanguageOnMainPage(List<String> items) {
        step("Open main page", () -> open(""));
        step("Click on the lang switcher", () -> mainPage.clickSwitchLanguageIcon());
        step("Result check", () -> $$(".header__nav-list").should(texts(items)));
    }

    static Stream<Arguments> switchLanguageOnMainPageData() {
        return Stream.of(
                Arguments.of(List.of("Company\n" +
                        "Consumer\n" +
                        "For Partners\n" +
                        "Investors\n" +
                        "Press Centre")));
    }

    @DisplayName("Проверка названий вкладок компании")
    @Test
    public void theCompanyTabContent() {
        step("Open main page", () -> open(""));
        step("Open company tab", () -> mainPage.clickOnText("Компания"));
        step("Check investors content exists", () -> mainPage.scrollToForInvestorsContent());
        step("Check header content", () -> mainPage.forInvestorsContentHeaderValue("Инвесторам"));
        step("Check key numbers content exists", () -> mainPage.scrollToKeyNumbersSection());
        step("Check header content", () -> mainPage.keyNumbersSectionContentHeaderValue("Ключевые цифры"));
        step("Check strategy content exists", () -> mainPage.scrollToStrategySection());
        step("Check header content", () -> mainPage.strategySectionHeaderValue("Стратегия"));
    }

    @DisplayName("Проверка вкладки 'Покупателю'")
    @Test
    public void theConsumerTabContentTest() {
        step("Open main page", () -> open(""));
        step("Open consumer tab", () -> mainPage.clickOnText("Покупателю"));
        step("Check header content", () -> mainPage.titleCheck("X5 для покупателя"));
    }


    @DisplayName("Проверка адреса на странице")
    @Test
    public void viewAddressOnPageTest() {
        step("Open main page", () -> open(""));
        step("Scroll to address", () -> mainPage.scrollToFooter());
        step("Check address value", () -> mainPage.footerAddressCheck("119049, Россия, г. Москва, улица Коровий Вал, 5, стр. 1"));
    }

    @DisplayName("Тест на проверку 'Поиск'")
    @Test
    public void searchFieldCheckTest() {
        step("Open main page", () -> open(""));
        step("Click search icon", () -> mainPage.searchIconClick());
        step("Set value in search field", () -> mainPage.setValueOnSearchField("Новости"));
        step("Click search button", () -> mainPage.clickOnText("Найти"));
        step("Check title", () -> mainPage.checkTitleOnSearchResult("Результаты поиска"));
        step("Check result", () -> mainPage.searchResultIsNotEmpty());
    }

}
