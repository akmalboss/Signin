package com.test.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SignUp3 : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up3)


        findViewById<Button>(R.id.nextBtn3)
            .setOnClickListener {
                val intent = Intent(this@SignUp3, SignUp4::class.java)
                startActivity(intent)
            }


    }


}