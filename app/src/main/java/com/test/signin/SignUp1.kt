package com.test.signin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SignUp1 : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up1)


        findViewById<Button>(R.id.nextBtn)
            .setOnClickListener {
                val intent = Intent(this@SignUp1, SignUp2::class.java)
                startActivity(intent)
            }


    }


}




    





