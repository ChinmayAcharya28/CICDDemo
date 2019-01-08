package com.raweng.hawks.cicdapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.raweng.hawks.cicdapplication", appContext.getPackageName());
    }

    @Test
    public void test01_add(){
        int i = 2;
        int j = 2;

        TestActivity activity = new TestActivity();
        int expected = activity.addition(i, j);
        int actual = i + j;

        assertEquals(actual, expected);
    }

    @Test
    public void test02_Multiplication(){
        int i = 2;
        int j = 2;

        TestActivity activity = new TestActivity();
        int expected = activity.multi(i, j);
        int actual = i * j;

        assertEquals(actual, expected);
    }

    @Test
    public void test03_Minus(){
        int i = 4;
        int j = 2;

        TestActivity activity = new TestActivity();
        String expected = activity.minus(i, j);
        String actual = "First Minus Me";

        assertEquals(actual, expected);
    }

    @Test
    public void test04_Minus(){
        int i = 2;
        int j = 4;

        TestActivity activity = new TestActivity();
        String expected = activity.minus(i, j);
        String actual = "Second Minus Me";

        assertEquals(actual, expected);
    }

    @Test
    public void test05_Equal(){
        int i = 2;
        int j = 2;

        TestActivity activity = new TestActivity();
        String expected = activity.minus(i, j);
        String actual = "Equal";

        assertEquals(actual, expected);
    }

    @Test
    public void test06_div(){
        int i = 4;
        int j = 2;

        TestActivity activity = new TestActivity();
        int expected = activity.divide(i, j);
        int actual = i/j;

        assertEquals(actual, expected);
    }
}
