package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GithubPage;

import static io.qameta.allure.Allure.step;

public class ExplorePageTest extends TestBase {
    private GithubPage ghp = new GithubPage();

    @Test
    @DisplayName("Check subheading on the page Explore")
    void openExplorePage() {
        step("Open Github", () -> {
            ghp.openPageGithub();
        });
        step("Click page 'Explore'", () -> {
            ghp.hoverMenu();
            ghp.clickExplore();
        });
        step("Check subheading", () -> {
            ghp.checkTextSecondary();
        });

    }
}
