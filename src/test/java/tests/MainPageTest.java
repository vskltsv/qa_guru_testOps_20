package tests;


import io.qameta.allure.Owner;
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
import static io.qameta.allure.Allure.step;

@Tag("remote_test")
@Owner("Vladimir Sokoltsov")
public class MainPageTest extends TestBase {
    public MainPage mainPage = new MainPage();

    @DisplayName("Проверка смены языка")
    @ParameterizedTest(name = "Language: {0}")
    @MethodSource("switchLanguageOnMainPageData")
    public void switchLanguageOnMainPage(List<String> items) {
        step("Открыть страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });
        step("Нажать на переключатель языка", () -> mainPage.clickSwitchLanguageIcon());
        step("Проверка результата", () -> $$(".header__nav-list").should(texts(items)));
    }

    static Stream<Arguments> switchLanguageOnMainPageData() {
        return Stream.of(
                Arguments.of(List.of("Company\n" +
                        "Consumer\n" +
                        "For Partners\n" +
                        "Investors\n" +
                        "Press Centre")));
    }


    @DisplayName("Проверка адреса на странице")
    @Test
    public void viewAddressOnPageTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
            mainPage.clickCookieConsent("Принять");
        });
        step("Прокрутить до адреса", () -> mainPage.scrollToFooter());
        step("Проверка значения адреса", () ->
                mainPage.footerAddressCheck("119049, Россия, г. Москва, улица Коровий Вал, 5, стр. 1"));
    }



}
