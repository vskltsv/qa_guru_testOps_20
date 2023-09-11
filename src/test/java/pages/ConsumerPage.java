package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ConsumerPage {
    private final SelenideElement
            goToConsumer = $(byText("Покупателю")),
            scrollToNews = $(".news-block__head"),
            checkNews = $(".news-block__head"),
            title = $(".hero-company__title"),
            goToAllPublication = $(".button--ghost");




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
    public ConsumerPage titleCheck(String value) {
        title.shouldHave(text(value));
        return this;

    }
    public ConsumerPage clickAllPublication() {
        goToAllPublication.shouldBe(visible).click();

        return this;
    }


}