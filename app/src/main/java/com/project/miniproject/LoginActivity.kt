package com.project.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_save.setOnClickListener(View.OnClickListener {
            if(edit_email.getText().toString().equals("sayali@gmail.com") && edit_pwd.getText().toString().equals("123")
                    && edit_mobileNo.getText().toString().equals("1234567895")){
                startActivity(Intent(this@LoginActivity,MainActivity::class.java))


            }else{
                Toast.makeText(this,"Invalid Login Credentials",Toast.LENGTH_SHORT).show()
            }

        })




    }
}