package jdi.hw1;

import jdi.HomePageInits;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.jdi.HomePageJDISite.homePage;
import static base.jdi.HomePageJDISite.metalAndColorsPage;
import static jdi.hw1.PageNames.HOME_PAGE;
import static jdi.hw1.data.TestData.*;


public class MetalsColors extends HomePageInits {


    @Test
    public void checkMetalsColors() {
        //1. Open browser
        homePage.open();

        //2. Login on JDI site as User
        homePage.login(PITER_CHAILOVSKII);
        homePage.checkOpened(HOME_PAGE);

        //3. Open Metals & Colors page by Header menu
        homePage.openByLeftMenu(METALS_COLORS);

        //4. Fill form Metals & Colors and submit data
        metalAndColorsPage.main.form.submit(METALS_COLORS);

        //5. Check result sections
        metalAndColorsPage.logSidebar.checkContains(METALS_COLORS);
        for (String line : createResultList()) {
            assert (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
