package base.jdi.pages;

import base.jdi.sections.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;


public class MetalAndColorsPage extends WebPage {

    @Css(".main-content") public Main main;

    @Css(".uui-side-bar[name='log-sidebar']") public LogSidebar logSidebar;

  /*  @Css("header") public Header header;
    @Css(".uui-side-bar[name='navigation-sidebar']") public NavigationSidebar navigationSidebar;

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

    @XPath(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;*/
	
}