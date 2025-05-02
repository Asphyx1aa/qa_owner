package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.OwnerDocsPage;

public class OwnerTests extends TestBase {
    OwnerDocsPage ownerDocsPage = new OwnerDocsPage();

    @Test
    @DisplayName("Проверяем наличие всех ссылок в разделе Getting Started")
    void gettingStartedSectionShouldContainLinks() {
        ownerDocsPage.openPage()
                .checkLinksInGettingStarted();
    }
}
