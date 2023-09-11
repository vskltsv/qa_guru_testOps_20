package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;

import static io.qameta.allure.Allure.step;

@Tag("remote_test")
@Owner("Vladimir Sokoltsov")
public class SearchResultsPageTest extends TestBase {
   public SearchResultsPage searchResultsPage = new SearchResultsPage();
   public MainPage mainPage = new MainPage();
    @DisplayName("Тест на проверку 'Поиск'")
    @Test
    public void searchFieldCheckTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });
        step("Нажать на иконку поиска", () -> mainPage.searchIconClick());
        step("Установить значение в поле поиска", () -> mainPage.setValueOnSearchField("Новости"));
        step("Нажать кнопку поиска", () -> mainPage.clickOnText("Найти"));
        step("Проверка заголовка", () -> searchResultsPage.checkTitleOnSearchResult("Результаты поиска"));
        step("Проверка результатов", () -> searchResultsPage.searchResultIsNotEmpty());
    }

    @Test
    @DisplayName("Проверка поиска")
    void searchTest() {

        String firstSearch = "география";
        String secondSearch = "X5 Group";
        String searchType = "по дате";

        step("Открыть страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });

        step("Поиск из главной стр", () -> {
            mainPage.searchFromMainPage(firstSearch);

            step("проверка поиска", () -> {
                searchResultsPage.checkSearch(firstSearch);
            });
        });

        step("Поиск из раздела результаты", () -> {
            searchResultsPage.searchFromResultPage(secondSearch);

            step("Тип поиска", () -> {
                searchResultsPage.searchFromResultPageView(searchType);
            });

            step("Поиск", () -> {
                searchResultsPage.searchResult("Найти");
            });

            step("проверка поиска", () -> {
                searchResultsPage.checkSearch(secondSearch);
            });
        });

        step("Переход на главную страницу", () -> {
            searchResultsPage.goToMainPage();
        });
    }
}