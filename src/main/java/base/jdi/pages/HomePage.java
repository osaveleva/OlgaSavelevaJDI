package base.jdi.pages;

import base.jdi.enums.PagesNames;
import base.jdi.hw1.entities.User;
import base.jdi.sections.Header;
import base.jdi.sections.NavigationSidebar;
import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.common.Text;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;

import static base.jdi.HomePageJDISite.*;


public class HomePage extends WebPage {
    @Css("header")
    public Header header;
    @Css(".uui-side-bar")
    public NavigationSidebar navigationSidebar;
    @Css("h3[name='main-title']")
    public Label mainTitle;
    @Css(".main-txt")
    public Text jdiText;

    public void login(User user) {
        header.userIcon.click();
        header.loginForm.loginAs(user);
    }

    public void openByLeftMenu(PagesNames page) {
        switch (page) {
            case CONTACT_FORM:
                navigationSidebar.contactForm.click();
                contacntForm.checkOpened();
                break;
            case METALS_COLORS:
                navigationSidebar.metalsColors.click();
                metalAndColorsPage.checkOpened();
                break;
        }

    }
}