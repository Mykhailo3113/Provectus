package com.testapp.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$x;

public class Chapter1Page {

    private final static Logger logger = LoggerFactory.getLogger(Chapter1Page.class);

    public SelenideElement getRadioButton() { return $x("//input[@id='radiobutton']"); }

    public SelenideElement getAssertText() { return $x("//div[@id='divontheleft']"); }

    public SelenideElement getHomePageLink() { return $x("//a[text()='Home Page']"); }

    public String getTextForAssert(){
        logger.info("Get text from assert message");
        return getAssertText().waitUntil(Condition.visible, 1000).getText();
    }

    public HomePage clickOnHomePageLink(){
        logger.info("Click on the Home Page link");
        getHomePageLink().waitUntil(Condition.visible,1000).click();
        return new HomePage();
    }
}
