package com.stilluntitled.activity;

import android.app.Activity;
import com.stilluntitled.darksouls.DarkSoulsActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@Config(manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class DarkSoulsActivityRobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(DarkSoulsActivity.class).create().get();
        assertTrue(activity != null);
    }
}
