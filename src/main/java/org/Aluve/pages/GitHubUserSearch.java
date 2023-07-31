package org.Aluve.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubUserSearch {
    WebDriver driver;

    public GitHubUserSearch(WebDriver driver) {
        this.driver = driver;
    }

    By bySearchBar = By.xpath("//div[@class='form-control']//following-sibling::input");
    By bySearchButton = By.xpath("//div[@class='form-control']//following-sibling::input//following-sibling::button");

    By byUser = By.xpath("//div[@class='sc-eDvSVe ghgOtH section-center']//child::h4");

    public void searchUser(String name) {
        driver.findElement(bySearchBar).sendKeys(name);
    }

    public void clickSearchBtn(){
        driver.findElement(bySearchButton).click();
    }
    public By getBySearchBar() {
        return bySearchBar;
    }

    public By getByUser() {
        return byUser;
    }
}
