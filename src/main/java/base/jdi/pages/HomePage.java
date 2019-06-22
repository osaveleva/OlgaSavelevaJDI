package base.jdi.pages;

import base.jdi.sections.Header;
import base.jdi.sections.NavigationSidebar;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;


public class HomePage extends WebPage {
    @Css("header")
    public Header header;
    @Css(".uui-side-bar")
    public NavigationSidebar navigationSidebar;
    @Css("h3[name='main-title']")
    public Label mainTitle;
    @Css(".main-txt")
    public Text jdiText;

}