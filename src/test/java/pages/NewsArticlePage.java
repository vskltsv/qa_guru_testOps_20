package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class NewsArticlePage {
    private final SelenideElement
            scrollToFile = $(".docslist__docs--tile"),
            downloadFile = $(".button-link-trigger-hover");




    public NewsArticlePage downloadingPressRelease(Boolean value) throws FileNotFoundException {
        scrollToFile.scrollIntoView(value);
        File file = downloadFile.download();
        Assertions.assertTrue(file.exists());

        return this;
    }
}
