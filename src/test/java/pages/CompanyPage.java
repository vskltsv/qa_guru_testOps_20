package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CompanyPage {
    private final SelenideElement
            forInvestorsSection = $(".for-investors"),
            keyNumbersSection = $(".key-numbers"),
            strategySectionHeader = $(".strategy__header");


    public CompanyPage scrollToForInvestorsContent() {
        forInvestorsSection.scrollIntoView(true);
        return this;
    }

    public CompanyPage forInvestorsContentHeaderValue(String value) {
        forInvestorsSection.shouldHave(text(value));
        return this;
    }

    public CompanyPage scrollToKeyNumbersSection() {
        keyNumbersSection.scrollIntoView(true);
        return this;
    }

    public CompanyPage keyNumbersSectionContentHeaderValue(String value) {
        keyNumbersSection.shouldHave(text(value));
        return this;
    }

    public CompanyPage scrollToStrategySection() {
        strategySectionHeader.scrollIntoView(true);
        return this;
    }

    public CompanyPage strategySectionHeaderValue(String value) {
        strategySectionHeader.shouldHave(text(value));
        return this;

    }
}
