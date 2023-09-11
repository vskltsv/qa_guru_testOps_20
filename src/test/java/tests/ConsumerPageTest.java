package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ConsumerPage;
import pages.MainPage;
import pages.NewsArticlePage;
import pages.PressReleasesPage;

import static com.codeborne.selenide.Condition.exist;
import static io.qameta.allure.Allure.step;


@Tag("remote_test")
@Owner("Vladimir Sokoltsov")
public class ConsumerPageTest extends TestBase {
    public MainPage mainPage = new MainPage();
    public ConsumerPage consumerPage = new ConsumerPage();
    public PressReleasesPage pressReleasesPage = new PressReleasesPage();
    public NewsArticlePage newsArticlePage = new NewsArticlePage();

    @DisplayName("Проверка содержания вкладки 'Покупателю'")
    @Test
    public void consumerTabContentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });
        step("Открыть вкладку 'Покупателю'", () -> mainPage.clickOnText("Покупателю"));
        step("Проверить содержание заголовка", () -> consumerPage.titleCheck("X5 для покупателя"));
    }

    @Test
    @DisplayName("Доступность раздела 'Новости' из вкладки 'Покупателю'")
    public void verifyNewsSectionAvailabilityInConsumerTab() {
        step("Открываем главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });

        step("Переходим в раздел 'Покупателю'", () -> {
            consumerPage.goToSectionConsumer();
        });
        step("Скроллим до новостного блока", () -> {
            consumerPage.scrollSectionNews(true);
        });
        step("Проверяем, что заголовок раздела 'Новости'", () -> {
            consumerPage.checkSectionNews(exist);
        });

    }

    @Test
    @DisplayName("Проверка, что есть возможность скачать пресс-релиз к статье")
    public void verifyAbilityToDownloadPressRelease() {
        step("Открываем главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });

        step("Переходим в раздел 'Покупателю'", () -> {
            consumerPage.goToSectionConsumer();
        });
        step("Скроллим до раздела 'Новости'", () -> {
            consumerPage.scrollSectionNews(true);
        });
        step("Переходим в раздел 'Все публикации'", () -> {
            consumerPage.clickAllPublication();
        });
        step("Выбираем первую статью в списке", () -> {
            pressReleasesPage.getFirstPublication();
        });
        step("Проверяем, что пресс-релиз к статье можно скачать", () -> {
            newsArticlePage.downloadingPressRelease(true);
        });
    }
}