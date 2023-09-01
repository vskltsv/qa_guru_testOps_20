package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ConsumerPage;
import pages.HeaderSearchPage;

import static com.codeborne.selenide.Condition.exist;
import static io.qameta.allure.Allure.step;


@Tag("remote_test")
public class ConsumerPageTest extends TestBase {
    ConsumerPage consumerPage = new ConsumerPage();
    HeaderSearchPage headerSearchPage = new HeaderSearchPage();
    @Test
    @DisplayName("Доступность раздела 'Новости' из вкладки 'Покупателю'")
    public void checkNewsSectionTests() {
        step("Открыть страницу", () -> {
            headerSearchPage.openPage("ru/", "Принять");
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
    public void checkAbilityToDownload() {
        step("Открыть страницу", () -> {
            headerSearchPage.openPage("ru/", "Принять");
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
            consumerPage.getFirstPublication();
        });
        step("Проверяем, что пресс-релиз к статье можно скачать", () -> {
            consumerPage.downloadingPressRelease(true);
        });
    }

}