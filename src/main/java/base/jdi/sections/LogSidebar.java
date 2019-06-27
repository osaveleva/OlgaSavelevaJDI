package base.jdi.sections;

import base.jdi.hw1.entities.MetalsColors;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

import static base.jdi.HomePageJDISite.metalAndColorsPage;
import static com.epam.matcher.testng.Assert.assertTrue;


public class LogSidebar extends Section {

    @FindBy(css = "div.info-panel-body.info-panel-body-result")
    public TextArea resultSection;


    public void checkContains(MetalsColors metalsColors){
        System.out.println("My list here "+metalsColors.asSiteLog());
       for (String line : metalsColors.asSiteLog()) {
            assertTrue (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
