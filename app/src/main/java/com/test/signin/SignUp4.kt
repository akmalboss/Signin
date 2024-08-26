package com.test.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SignUp4 : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up4)


        findViewById<Button>(R.id.nextBtn4)
            .setOnClickListener {
                val intent = Intent(this@SignUp4, MainActivity::class.java)
                startActivity(intent)
            }


    }


}