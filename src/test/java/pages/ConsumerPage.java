package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ConsumerPage {
    private final SelenideElement
            goToConsumer = $(".header__nav-link"),
            scrollToNews = $(".news-block__head"),
            checkNews = $(".news-block__head"),
            goToAllPublication = $("[class='button button--ghost']").shouldHave(text("Все публикации")),
            chooseFirstPublication = $("#splide01-slide01"),
            scrollToFile = $(".docslist__docs--tile"),
            downloadFile = $(".button-link-trigger-hover");


    public ConsumerPage goToSectionConsumer() {
        goToConsumer.click();

        return this;
    }

    public ConsumerPage scrollSectionNews(Boolean value) {
        scrollToNews.scrollIntoView(value);

        return this;
    }

    public ConsumerPage checkSectionNews(Condition value) {
        checkNews.shouldBe(value);

        return this;
    }

    public ConsumerPage clickAllPublication() {
        goToAllPublication.shouldBe(visible).shouldBe(enabled).click();

        return this;
    }

    public ConsumerPage getFirstPublication() {
        chooseFirstPublication.click();

        return this;
    }

    public ConsumerPage downloadingPressRelease(Boolean value) throws FileNotFoundException {
        scrollToFile.scrollIntoView(value);
        File file = downloadFile.download();
        Assertions.assertTrue(file.exists());

        return this;
    }
}