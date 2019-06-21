package base.jdi.sections;

import base.jdi.enums.OddsEven;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.XPath;

public class Summary extends Section {

    @FindBy(css = "#odds-selector p")
    public RadioButtons<OddsEven> odd;

    @FindBy(css = "#even-selector p")
    public RadioButtons<OddsEven> even;

    @XPath(".//button[@type='submit' and contains(.,'Calculate')]") public Button calculate;
}
