package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.GithubPage;

import static io.qameta.allure.Allure.step;

public class NavigatorExplorePageTest extends TestBase {
    private GithubPage ghp = new GithubPage();

    @CsvSource({
            "Topics,Browse popular topics on GitHub.",
            "Trending,'See what the GitHub community is most excited about today.'",
            "Collections,'Curated lists and insight into burgeoning industries, topics, and communities.'",
            "Events,'Connect with the GitHub community at conferences, meetups, and hackathons around the world.'",
            "GitHub Sponsors,'Fund the work of developers and projects you depend on.'"
    })
    @ParameterizedTest
    @DisplayName("Check description on different navigation pages")
    void openNavigatorPageByExplore(String navTitle, String description) {
        step("Open Github", () -> {
            ghp.openPageExplore();
        });
        step("Click " + navTitle, () -> {
            ghp.clickNavigator(navTitle);
        });
        step("Check " + description, () -> {
            ghp.checkDescription(description);
        });
    }

}
