package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubPage {
    public static final String URL = "https://github.com";
    public static final String menu = "Explore";
    public static final String elementExplore = "Explore GitHub";
    public static final String elementCommunity = "Community forum";
    public static final String textSecondary = "Here's what's popular on GitHub today...";
    public static final String textSubheading = "We're here to help. Find solutions, share ideas, and follow discussions.";

    private SelenideElement searchExplore = $(By.linkText(elementExplore));
    private SelenideElement searchCommunity = $(By.linkText(elementCommunity));
    private SelenideElement searchSubheading = $(".search-banner-subheading");

    private ElementsCollection searchMenu = $$(".d-lg-flex li");

    private ElementsCollection searchNavigator = $$(".container-lg .js-selected-navigation-item");

    private ElementsCollection searchDescription = $$(".color-bg-secondary .f4");
    private ElementsCollection searchText = $$(".col-md-8 .mb-n2");


    public void openPageExplore() {
        open(URL + "/explore");
    }

    public void openPageGithub() {
        open(URL);
    }

    public void hoverMenu() {
        searchMenu.findBy(text(menu)).hover();
    }

    public void clickExplore() {
        searchExplore.click();
    }

    public void clickCommunity() {
        searchCommunity.click();
    }

    public void clickNavigator(String navTitle) {
        searchNavigator.findBy(text(navTitle)).click();
    }

    public void checkDescription(String description) {
        searchDescription.shouldHave(itemWithText(description));
    }

    public void checkTextSecondary() {
        searchText.shouldHave(itemWithText(textSecondary));
    }

    public void checkTextSubheading() {
        searchSubheading.shouldHave(text(textSubheading));
    }
}
