package base.jdi.sections;

import base.jdi.hw1.entities.MetalsColors;
import beans.JDIEx8MetalsColors;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

import static base.jdi.hw1.entities.MetalsColors.asSiteLog;
import static com.epam.matcher.testng.Assert.assertTrue;


public class LogSidebar extends Section {

    @FindBy(css = "div.info-panel-body.info-panel-body-result")
    public TextArea resultSection;


    public void checkContains(MetalsColors metalsColors) {
        for (String line : metalsColors.asSiteLog()) {
            assertTrue(resultSection.getText().contains(line));
        }
    }

    public void checkContains(JDIEx8MetalsColors jdiEx8MetalsColors) {
        for (String line : asSiteLog(jdiEx8MetalsColors)) {
            assertTrue(resultSection.getText().contains(line));
        }
    }
}
