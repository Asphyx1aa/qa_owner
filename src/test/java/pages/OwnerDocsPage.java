package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OwnerDocsPage {
    SelenideElement gettingStartedSection = $("aside").$(byText("Getting Started")),
            listOfLinksInGettingStarted = gettingStartedSection.sibling(0);

    @Step("Открываем страницу с документацией")
    public OwnerDocsPage openPage() {
        open("/owner/docs/welcome");
        return this;
    }

    @Step("Проверяем, что раздел содержит нужную ссылку на установку")
    public OwnerDocsPage checkLinksInGettingStarted() {
        listOfLinksInGettingStarted.shouldHave(text("Installation"));
        return this;
    }

}
