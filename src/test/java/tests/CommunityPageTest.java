package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GithubPage;

import static io.qameta.allure.Allure.step;

public class CommunityPageTest extends TestBase {
    private GithubPage ghp = new GithubPage();

    @Test
    @DisplayName("Check secondary text on the page Community forum")
    void openExplorePage() {
        step("Open Github", () -> {
            ghp.openPageGithub();
        });
        step("Click page 'Community forum'", () -> {
            ghp.hoverMenu();
            ghp.clickCommunity();
        });
        step("Check secondary text", () -> {
            ghp.checkTextSubheading();
        });

    }
}
