package jdi.hw2;

import base.jdi.hw2.ResultListBuilder;
import beans.JDIEx8MetalsColors;
import jdi.HomePageInits;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static base.jdi.EpamPageConstants.VEGETABLES_DEFAULT;
import static base.jdi.HomePageJDISite.homePage;
import static base.jdi.HomePageJDISite.metalAndColorsPage;
import static base.jdi.hw2.ParseJson.getDataSetsValues;
import static jdi.hw2.data.TestData.PITER_CHAILOVSKII;


public class MetalsColors extends HomePageInits {

    @DataProvider
    public Object[] getData() throws FileNotFoundException {
        return getDataSetsValues();
    }

    @Test(dataProvider = "getData")
    public void checkMetalsColorsPage(JDIEx8MetalsColors jdiEx8MetalsColors) {

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
        // TODO Should be included in PO call
        metalAndColorsPage.main.form.odd.select(jdiEx8MetalsColors.summary.get(0).toString());
        metalAndColorsPage.main.form.even.select(jdiEx8MetalsColors.summary.get(1).toString());
        metalAndColorsPage.main.form.metals.select(jdiEx8MetalsColors.metals);
        metalAndColorsPage.main.form.colors.select(jdiEx8MetalsColors.color);
        metalAndColorsPage.main.form.vegetables.check(VEGETABLES_DEFAULT);

        for (String i : jdiEx8MetalsColors.vegetables) {
            metalAndColorsPage.main.form.vegetables.check(i);
        }

        for (String elem : jdiEx8MetalsColors.elements) {
            metalAndColorsPage.main.form.natureElementsCheckList.check(elem);
        }

        metalAndColorsPage.main.form.submit.click();
        // !TODO

        //5. Check result sections
        ResultListBuilder resultListBuilder = new ResultListBuilder();
        resultListBuilder.setParam(jdiEx8MetalsColors);
        List<String> lines = resultListBuilder.makeList();
        for (String line : lines) {
            assert (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
