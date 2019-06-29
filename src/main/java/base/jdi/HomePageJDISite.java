package base.jdi;

import base.jdi.pages.*;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;


@JSite("https://epam.github.io")
public class HomePageJDISite extends WebSite {
    @JPage(url = "/JDI/index.html", title = "Home Page")
    public static HomePage homePage;
    @JPage(url = "/JDI/metals-colors.html", title = "Metal and Colors")
    public static MetalAndColorsPage metalAndColorsPage;
    @JPage(url = "/JDI/contacts.html", title = "Contact Form")
    public static MetalAndColorsPage contacntForm;
}