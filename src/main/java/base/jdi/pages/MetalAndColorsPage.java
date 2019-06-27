package base.jdi.pages;

import base.jdi.hw1.entities.MetalsColors;
import base.jdi.sections.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;


public class MetalAndColorsPage extends WebPage {

    @Css("form.form")
    public MetalsColordsForm form;

    @Css(".uui-side-bar[name='log-sidebar']")
    public LogSidebar logSidebar;


}