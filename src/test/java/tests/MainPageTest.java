package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("remote")
public class MainPageTest extends TestBase {

    @DisplayName("Company tab titles check")
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

    @DisplayName("Consumer tab title check")
    @Test
    public void theConsumerTabContent() {
        step("Open main page", () -> open(""));
        step("Open consumer tab", () -> mainPage.clickOnText("Покупателю"));
        step("Check header content", () -> mainPage.titleCheck("X5 для покупателя"));
    }


    @DisplayName("Check address on page")
    @Test
    public void viewAddressOnPage() {
        step("Open main page", () -> open(""));
        step("Scroll to address", () -> mainPage.scrollToFooter());
        step("Check address value", () -> mainPage.footerAddressCheck("119049, Россия, г. Москва, улица Коровий Вал, 5, стр. 1"));
    }

    @DisplayName("Search field test")
    @Test
    public void searchFieldCheck() {
        step("Open main page", () -> open(""));
        step("Click search icon", () -> mainPage.searchIconClick());
        step("Set value in search field", () -> mainPage.setValueOnSearchField("Новости"));
        step("Click search button", () -> mainPage.clickOnText("Найти"));
        step("Check title", () -> mainPage.checkTitleOnSearchResult("Результаты поиска"));
        step("Check result", () -> mainPage.searchResultIsNotEmpty());
    }

}
