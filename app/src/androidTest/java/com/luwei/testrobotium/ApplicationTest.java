package com.luwei.testrobotium;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

public class ApplicationTest extends ActivityInstrumentationTestCase2 {

    private static final String ACTIVITY = "com.luwei.testrobotium.WebActivity";

    private Solo solo;

    public ApplicationTest() throws ClassNotFoundException{
        super(Class.forName(ACTIVITY));
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testWidget() throws Exception {

        solo.waitForActivity("WebActivity", 20000);

        //solo.clickOnView(solo.getView("end_btn"));
        //solo.clickOnView(solo.getView("结束"));

        //solo.clickOnButton(3);
        //solo.clickOnButton("结束");
        //solo.clickOnButton(3);

        //solo.enterText((EditText)solo.getView(R.id.input_et), "ccc");
        //solo.enterText((EditText)solo.getView(R.id.input_et2), "ddd");
//        solo.enterText(1, "aaa");
//        solo.enterText(0, "bbb");
//        solo.clickOnButton(1);

//        solo.enterTextInWebElement(By.id("Login_username"), "admin");
        solo.enterTextInWebElement(By.name("username"), "admin");
        solo.enterTextInWebElement(By.name("password"), "admin");
        solo.clickOnWebElement(By.id("Login_0"));

        //solo.clickOnWebElement(solo.getWebElement);

        //solo.waitForWebElement()



        assertTrue("文案错误2", solo.searchText("aaa"));
    }
}