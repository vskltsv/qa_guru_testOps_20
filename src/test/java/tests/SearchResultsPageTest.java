package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchResultsPage;

import static io.qameta.allure.Allure.step;

@Tag("remote_test")
public class SearchResultsPageTest extends TestBase {
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @DisplayName("Проверка поиска")
    void headerSearchTest() {

        String firstSearch = "география";
        String secondSearch = "X5 Group";
        String searchType = "по дате";

        step("Открыть страницу", () -> {
            searchResultsPage.openPage("", "Принять");
        });

        step("Поиск из главной стр", () -> {
            searchResultsPage.searchFromMainPage(firstSearch);

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