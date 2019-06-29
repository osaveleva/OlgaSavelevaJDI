package base.jdi.sections;

import base.jdi.enums.Vegetables;
import base.jdi.hw1.entities.MetalsColors;
import base.jdi.enums.NatureElements;
import base.jdi.enums.OddsEven;
import beans.JDIEx8MetalsColors;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JComboBox;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropList;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.XPath;
import cucumber.api.java.tr.Ve;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static base.jdi.enums.NatureElements.Fire;
import static base.jdi.enums.NatureElements.Water;
import static base.jdi.hw1.entities.MetalsColors.getEven;
import static base.jdi.hw1.entities.MetalsColors.getOdd;

public class MetalsColordsForm extends Form<MetalsColors> {

    @FindBy(css = "#odds-selector p")
    public RadioButtons<OddsEven> odd;

    @FindBy(css = "#even-selector p")
    public RadioButtons<OddsEven> even;

    @FindBy(css = "#elements-checklist p")
    public CheckList<NatureElements> natureElements;

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


    private void checkVegetables() {
        if (vegetables.getText() != null) {
            vegetables.check(vegetables.getText());
        }
    }

    @Override
    public void submit(MetalsColors metalsColors) {
        checkVegetables();
        vegetables.check(metalsColors.vegetables.toArray(new Vegetables[0]));
        natureElements.check(metalsColors.natureElements.toArray(new NatureElements[0]));
        super.submit(metalsColors);
    }

    public void submit(JDIEx8MetalsColors jdiEx8MetalsColors) {
        odd.select(String.valueOf(getOdd(jdiEx8MetalsColors)));
        even.select(String.valueOf(getEven(jdiEx8MetalsColors)));
        checkVegetables();
        vegetables.check(jdiEx8MetalsColors.vegetables.toArray(new String[0]));
        natureElements.check(jdiEx8MetalsColors.elements.toArray(new String[0]));
        colors.select(jdiEx8MetalsColors.color);
        metals.select(jdiEx8MetalsColors.metals);
        submit.click();
    }

}
