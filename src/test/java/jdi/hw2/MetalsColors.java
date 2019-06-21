package jdi.hw2;

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
    public Object[][] getData() throws FileNotFoundException {
        return getDataSetsValues();
    }


    @Test(dataProvider = "getData")
    public void checkMetalsColorsPage(List<Integer> summary, String metals, String colors, List<String> vegetables, List<String> elements, List<String> lines) {
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
        metalAndColorsPage.main.form.odd.select(summary.get(0).toString());
        metalAndColorsPage.main.form.even.select(summary.get(1).toString());
        metalAndColorsPage.main.form.metals.select(metals);
        metalAndColorsPage.main.form.colors.select(colors);
        metalAndColorsPage.main.form.vegetables.check(VEGETABLES_DEFAULT);

        for (String i : vegetables) {
            metalAndColorsPage.main.form.vegetables.check(i);
        }

        for (String elem : elements) {
            metalAndColorsPage.main.form.natureElementsCheckList.check(elem);
        }

        metalAndColorsPage.main.form.submit.click();

        for (String line : lines) {
            assert (metalAndColorsPage.logSidebar.resultSection.getText().contains(line));
        }

    }
}
