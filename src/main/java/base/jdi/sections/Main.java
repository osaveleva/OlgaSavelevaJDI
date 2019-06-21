package base.jdi.sections;

import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;

public class Main extends Section {
    @Css("form.form") public MetalsColordsForm form;

 //   @XPath(".//button[@type='submit']") public Button calculate;

}