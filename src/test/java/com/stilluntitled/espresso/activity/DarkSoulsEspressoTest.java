package com.stilluntitled.espresso.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import com.stilluntitled.R;
import com.stilluntitled.darksouls.DarkSoulsActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class DarkSoulsEspressoTest extends ActivityInstrumentationTestCase2<DarkSoulsActivity> {

    @SuppressWarnings("deprecation")
     public DarkSoulsEspressoTest() {
       // This constructor was deprecated - but we want to support lower API levels.
       super("com.example.activity", DarkSoulsActivity.class);
     }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testCheckText() {
        onView(withId(R.id.text))
            .check(matches(withText("Prepare to die!")));
      }
}
