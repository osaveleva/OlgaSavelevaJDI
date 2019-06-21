package base.jdi.sections;

import base.jdi.hw1.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.XPath;


public class LoginForm extends Form<User> {
    @XPath(".//button[@type='submit']") public Button loginButton;
    @Css("input[type=text]") public TextField name;
    @Css("input[type=password]") public TextField password;
	
}