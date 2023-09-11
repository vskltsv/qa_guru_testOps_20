package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PressReleasesPage {
    private final SelenideElement
            chooseFirstPublication = $("#splide01-slide01");


    public PressReleasesPage getFirstPublication() {
        chooseFirstPublication.click();

        return this;
    }
}
