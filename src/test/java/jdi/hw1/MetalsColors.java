package jdi.hw1;

import jdi.HomePageInits;
import org.testng.annotations.Test;

import java.util.List;

import static base.jdi.HomePageJDISite.homePage;
import static base.jdi.HomePageJDISite.metalAndColorsPage;
import static jdi.hw1.data.TestData.*;


public class MetalsColors extends HomePageInits {


    @Test
    public void checkMetalsColors() {
        List<String> list;

        //1. Open browser
        homePage.open();

        //2. Login on JDI site as User
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(PITER_CHAILOVSKII);
        homePage.checkOpened();

        //3. Open Metals & Colors page by Header menu
        homePage.navigationSidebar.metalsColors.click();
        metalAndColorsPage.checkOpened();

        //4. Fill form Metals & Colors and submit data
        metalAndColorsPage.main.form.submit(METALS_COLORS);

        //5. Check result sections
        list = createResultList();
        for (String line : list) {
            assert (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
