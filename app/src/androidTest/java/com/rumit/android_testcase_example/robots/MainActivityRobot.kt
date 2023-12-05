package com.rumit.android_testcase_example.robots

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import com.rumit.android_testcase_example.R
import org.junit.Assert

fun mainActivityScope(func: MainActivityRobot.() -> Unit) =
    MainActivityRobot().apply { func() }

class MainActivityRobot : BaseTestRobot() {

    fun application() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.rumit.android_testcase_example", appContext.packageName)


    }

    fun titleIsShown() {
        viewWithIdIsDisplayed(R.id.tv_title)
    }

    fun titleTextIsShown(title: String) {
        viewWithIdTextIsDisplayed(R.id.tv_title, title)

    }

    fun enterName(name: String) {

        enterTextOnViewWithId(R.id.et_name, name)

    }

    fun isButtonVisible() {
        visibilityWithId(R.id.btn_start)
    }

    fun isToastVisible() {
        toastVisibilityWithId(R.id.btn_start)
    }

    fun pressStart() {
        clickViewWithId(R.id.btn_start)
    }
}