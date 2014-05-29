package com.tekadept.utest.app.tests;

import android.test.ActivityInstrumentationTestCase2;
import com.tekadept.utest.app.MainActivity;

import junit.framework.Assert;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testGetGreeting() throws Exception {
        MainActivity activity = getActivity();
        int count = 0;
        String result = activity.getGreeting(count);
        Assert.assertEquals("Hola mundo", result);

        count = 1;
        result = activity.getGreeting(count);
        Assert.assertEquals("Bonjour tout le monde", result);

        count = 2;
        result = activity.getGreeting(count);
        Assert.assertEquals("Ciao mondo", result);

        count = 3;
        result = activity.getGreeting(count);
        Assert.assertEquals("Hallo Welt", result);
    }
}

