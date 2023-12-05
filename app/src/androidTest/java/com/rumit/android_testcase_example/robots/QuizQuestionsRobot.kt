package com.rumit.android_testcase_example.robots

import com.rumit.android_testcase_example.R

fun quizActivityScope(func: QuizQuestionsRobot.() -> Unit) =
    QuizQuestionsRobot().apply { func() }

class QuizQuestionsRobot : BaseTestRobot() {

    fun isOnQuestionsScreen() {
        viewWithIdIsDisplayed(R.id.tv_question)
    }

    fun selectAnswer(option: Int) {
        when (option) {
            1 -> {
                clickViewWithId(R.id.tv_option_one)
            }

            2 -> {
                clickViewWithId(R.id.tv_option_two)
            }

            3 -> {
                clickViewWithId(R.id.tv_option_three)
            }

            4 -> {
                clickViewWithId(R.id.tv_option_four)
            }
        }
    }

    fun clickSubmit() {
        clickViewWithId(R.id.btn_submit)
    }

    fun goToNextQuestion() {
        clickViewWithId(R.id.btn_submit)
    }

    fun answerAllCorrectly() {
        selectAnswer(1)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(2)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(4)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(3)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(2)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(2)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(3)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(1)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(4)
        clickSubmit()
        goToNextQuestion()
        selectAnswer(3)
        clickSubmit()
        goToNextQuestion()
    }
}