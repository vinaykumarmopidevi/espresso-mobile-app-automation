package com.rumit.android_testcase_example

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rumit.android_testcase_example.Constants.USER_NAME
import com.rumit.android_testcase_example.utils.isValidNameValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if (isValidNameValue(etName.text.toString().trim())) {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this,
                    "Please enter valid name. Characters should between 4 to 9", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}