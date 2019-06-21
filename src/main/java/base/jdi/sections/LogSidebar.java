package base.jdi.sections;
import com.epam.jdi.uitests.web.selenium.elements.common.TextArea;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;


public class LogSidebar extends Section {

   @FindBy(css = "div.info-panel-body.info-panel-body-result")
   public TextArea resultSection;
}
