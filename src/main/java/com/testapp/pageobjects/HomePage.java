package com.testapp.pageobjects;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private final static Logger logger = LoggerFactory.getLogger(HomePage.class);

    public SelenideElement getHomePageTitle() { return $x("//div[@class='mainheading']"); }

    public SelenideElement getChapter1Tab() { return $x("//a[text()= 'Chapter1']"); }

    public SelenideElement getChapter2Tab() { return $x("//a[text()= 'Chapter2']"); }

    public SelenideElement getChapter3Tab() { return $x("//a[text()= 'Chapter3']"); }

    public SelenideElement getChapter4Tab() { return $x("//a[text()= 'Chapter4']"); }

    public SelenideElement getChapter8Tab() { return $x("//a[text()= 'Chapter8']"); }

    public HomePage openHomePage(String url){
        logger.info("Open Home Page");
        open(url);
        getHomePageTitle().waitUntil(Condition.visible, 1000);
        return this;
    }

    public Chapter1Page clickOnChapter1Tab(){
        logger.info("Click on the Chapter1 tab");
        getChapter1Tab().waitUntil(Condition.visible, 1000).click();
        return new Chapter1Page();
    }

}
