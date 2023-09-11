package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CompanyPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("remote_test")
@Owner("Vladimir Sokoltsov")
public class CompanyPageTest extends TestBase {
    public MainPage mainPage = new MainPage();
    public CompanyPage companyPage = new CompanyPage();

    @DisplayName("Проверка названий вкладок компании")
    @Test
    public void verifyCompanyTabTitles() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });
        step("Открыть вкладку 'Компания'", () -> mainPage.clickOnText("Компания"));
        step("Проверка существования информации для инвесторов", () -> companyPage.scrollToForInvestorsContent());
        step("Проверка заголовка", () -> companyPage.forInvestorsContentHeaderValue("Инвесторам"));
        step("Проверка существования ключевых цифр", () -> companyPage.scrollToKeyNumbersSection());
        step("Проверка заголовка", () -> companyPage.keyNumbersSectionContentHeaderValue("Ключевые цифры"));
        step("Проверка существования раздела 'Стратегия'", () -> companyPage.scrollToStrategySection());
        step("Проверка заголовка", () -> companyPage.strategySectionHeaderValue("Стратегия"));
    }
}
