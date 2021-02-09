package ui;

import com.testapp.pageobjects.HomePage;
import com.testapp.pageobjects.Chapter1Page;
import com.testapp.utils.PropertiesUtils;
import org.testng.Assert;
import org.testng.annotations.*;
import ui.common.BaseTest;

public class Chapter1Test extends BaseTest {

  private HomePage homePage = new HomePage();
  private Chapter1Page chapter1Page = new Chapter1Page();

  @BeforeMethod
  public void beforeMethod() {
    configurationParameters = PropertiesUtils.getProperties();
  }

  @Test
  public void chapterTest() {
    homePage.openHomePage(configurationParameters.getUrl())
            .clickOnChapter1Tab();
    Assert.assertEquals("Assert that this text is on the page", chapter1Page.getTextForAssert(), "Assert text does not match.");
  }

  @AfterMethod
  public void afterMethod(){
    chapter1Page.clickOnHomePageLink();
  }

}
