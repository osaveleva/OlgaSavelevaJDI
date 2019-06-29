package jdi.hw2;

import beans.JDIEx8MetalsColors;
import jdi.HomePageInits;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static base.jdi.HomePageJDISite.homePage;
import static base.jdi.HomePageJDISite.metalAndColorsPage;
import static base.jdi.enums.PagesNames.METALS_COLORS;
import static base.jdi.hw2.ParseJson.getDataSetsValues;
import static jdi.data.TestData.PITER_CHAILOVSKII;


public class HW2MetalsColorsTest extends HomePageInits {

    @DataProvider
    public Object[] getData() throws FileNotFoundException {
        return getDataSetsValues();
    }

    @Test(dataProvider = "getData")
    public void checkMetalsColorsPage(JDIEx8MetalsColors jdiEx8MetalsColors) {

        //1. Open browser
        homePage.open();

        //2. Login on JDI site as User
        homePage.login(PITER_CHAILOVSKII);
        homePage.checkOpened();

        //3. Open Metals & Colors page by Header menu
        homePage.openByLeftMenu(METALS_COLORS);

        // TODO Should be included in PO call
        //4. Fill form Metals & Colors and submit data
        metalAndColorsPage.form.submit(jdiEx8MetalsColors);

        // !TODO
        //5. Check result sections
        metalAndColorsPage.logSidebar.checkContains(jdiEx8MetalsColors);
    }
}
