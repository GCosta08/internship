package starter.wikipedia;


import org.junit.Test;
//import org.junit.runner.RunWith;
//import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;




@ExtendWith(SerenityJUnit5Extension.class)


    /**
     * Define the webdriver instance to be used for these tests
     */



public class WhenSearchingForTerms{
@Managed(driver="firefox")
public WebDriver driver;
	/**
     * Navigation actions. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
	@Steps
    NavigateActions navigate;

    /**
     * Actions related to searches. This is a UIInteraction class so it will be instantiated automatically by Serenity.
     */
    SearchActions search;

    /**
     * A page object representing a Wikipedia article that is currently appearing in the browser.
     * Page Objects are automatically initialised by Serenity.
     */
    DisplayedArticle displayedArticle;

    @Test
    public void searchBySingleKeyword() {
        navigate.toTheHomePage();
        search.searchBy("Everest");
        Serenity.reportThat("The first heading should be 'Mount Everest'", null);
         // () -> assertThat(displayedArticle.getFirstHeading()).isEqualTo("Mount Everest";);
        
 
}


}