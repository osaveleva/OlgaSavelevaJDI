package base.jdi.sections;

import base.jdi.enums.NatureElements;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;

public class ElementBlock extends Section {

    @FindBy(css ="#elements-checklist p")
    public CheckList<NatureElements> natureElementsCheckList;
}
