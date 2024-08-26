package com.test.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SignUp2 : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)


        findViewById<Button>(R.id.nextBtn1)
            .setOnClickListener {
                val intent = Intent(this@SignUp2, SignUp3::class.java)
                startActivity(intent)
            }


    }


}