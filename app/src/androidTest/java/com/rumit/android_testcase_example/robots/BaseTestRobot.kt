package com.rumit.android_testcase_example.robots

import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText


open class BaseTestRobot {

    fun enterTextOnViewWithId(@IdRes viewId: Int, text: String) {
        onView(withId(viewId)).perform(ViewActions.typeText(text))
        closeSoftKeyboard()
    }

    fun visibilityWithId(@IdRes viewId: Int) {
        onView(withId(viewId))
            .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
    }

    fun toastVisibilityWithId(@IdRes viewId: Int) {
        onView(withText("Please enter valid name. Characters should between 4 to 9"))
            .inRoot(ToastMatcher())
            .check(matches(isDisplayed()))
    }

    fun clickViewWithId(@IdRes viewId: Int) {
        onView(withId(viewId))
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun viewWithIdIsDisplayed(@IdRes viewId: Int) {

        onView(withId(viewId))
            .check(matches(isDisplayed()))
    }

    fun viewWithIdTextIsDisplayed(@IdRes viewId: Int, text: String) {
        //onView(withId(viewId)).perform(ViewActions.swipeUp());

        onView(withId(viewId))
            .check(matches(withText(text)));

    }


    fun textIsDisplayed(text: String) {
        onView(withText(text))
    }


}