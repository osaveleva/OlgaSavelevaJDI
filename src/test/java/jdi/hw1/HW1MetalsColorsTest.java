package jdi.hw1;

import jdi.HomePageInits;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.jdi.HomePageJDISite.homePage;
import static base.jdi.HomePageJDISite.metalAndColorsPage;

import static base.jdi.enums.NatureElements.Fire;
import static base.jdi.enums.NatureElements.Water;
import static base.jdi.enums.PagesNames.*;
import static base.jdi.enums.PagesNames.METALS_COLORS;
import static jdi.hw1.data.TestData.*;


public class HW1MetalsColorsTest extends HomePageInits {


    @Test
    public void checkMetalsColors() {
        //1. Open browser
        homePage.open();

        //2. Login on JDI site as User
        homePage.login(PITER_CHAILOVSKII);
        homePage.checkOpened();

        //3. Open Metals & Colors page by Header menu
        homePage.openByLeftMenu(METALS_COLORS);

        //4. Fill form Metals & Colors and submit data
        metalAndColorsPage.form.submit(METALS_COLORS_VALUES);
      //  metalAndColorsPage.form.natureElementsCheckList.

        //5. Check result sections
        metalAndColorsPage.logSidebar.checkContains(METALS_COLORS_VALUES);
    }
}
