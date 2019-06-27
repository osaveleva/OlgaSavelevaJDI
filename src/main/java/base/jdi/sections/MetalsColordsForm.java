package base.jdi.sections;

import base.jdi.enums.Vegetables;
import base.jdi.hw1.entities.MetalsColors;
import base.jdi.enums.NatureElements;
import base.jdi.enums.OddsEven;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropList;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.XPath;

public class MetalsColordsForm extends Form<MetalsColors> {

    @FindBy(css = "#odds-selector p")
    public RadioButtons<OddsEven> odd;

    @FindBy(css = "#even-selector p")
    public RadioButtons<OddsEven> even;

    @FindBy(css = "#elements-checklist p")
    public CheckList<NatureElements> natureElementsCheckList;

    @XPath(".//button[@type='submit' and contains(.,'Submit')]")
    public Button submit;

    @JDropdown(root = @FindBy(css = "div[ui=dropdown]"),
            value = @FindBy(css = ".filter-option"),
            list = @FindBy(css = "li"),
            expand = @FindBy(css = ".caret")
    )
    public Dropdown colors;

    @JComboBox(root = @FindBy(css = "div[ui=combobox]"),
            value = @FindBy(css = "input"),
            list = @FindBy(css = "li"),
            expand = @FindBy(css = ".caret")
    )
    public ComboBox metals;

    @JDropList(root = @FindBy(css = "div[ui=droplist]"),
            value = @FindBy(css = "button"),
            list = @FindBy(css = "li"),
            expand = @FindBy(css = ".caret")
    )
    public DropList vegetables;

    @Override
    public void submit(MetalsColors metalsColors) {
        // odd.select(metalsColors.getOdd());
        //  even.select(metalsColors.even);
        //method(strs.toArray(new String[strs.size()]));
        if (vegetables.getText() != null) {
            vegetables.check(vegetables.getText());
            vegetables.check(metalsColors.vegetables.toArray(new Vegetables[0]));
        } else {
            vegetables.check(metalsColors.vegetables.toArray(new Vegetables[0]));
        }
        natureElementsCheckList.check(metalsColors.natureElements.toArray(new NatureElements[0]));
        super.submit(metalsColors);
    }

}
