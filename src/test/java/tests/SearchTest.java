package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HeaderSearchPage;

import static io.qameta.allure.Allure.step;

@Tag("remote_test")
public class SearchTest extends TestBase {
    HeaderSearchPage headerSearchPage = new HeaderSearchPage();

    @Test
    @DisplayName("Проверка поиска")
    void headerSearchTest() {

        String firstSearch = "география";
        String secondSearch = "X5 Group";
        String searchType = "по дате";

        step("Открыть страницу", () -> {
            headerSearchPage.openPage("ru/", "Принять");
        });

        step("Поиск из главной стр", () -> {
            headerSearchPage.searchFromMainPage(firstSearch);

            step("проверка поиска", () -> {
                headerSearchPage.checkSearch(firstSearch);
            });
        });

        step("Поиск из раздела результаты", () -> {
            headerSearchPage.searchFromResultPage(secondSearch);

            step("Тип поиска", () -> {
                headerSearchPage.searchFromResultPageView(searchType);
            });

            step("Поиск", () -> {
                headerSearchPage.searchResult("Найти");
            });

            step("проверка поиска", () -> {
                headerSearchPage.checkSearch(secondSearch);
            });
        });

        step("Переход на главную страницу", () -> {
            headerSearchPage.goToMainPage();
        });
    }
}