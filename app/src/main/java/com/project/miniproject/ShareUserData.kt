package com.project.miniproject

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_share_user_data.*

class ShareUserData:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_user_data)

        if(intent != null){
            var name :String = intent.getStringExtra("Name").toString();
            var email :String = intent.getStringExtra("Email").toString();
            var mobile :String = intent.getStringExtra("MobileNo").toString();

            var displayContentsArrayList:Array<String>
            //val contents: Contents = Contents();
//            contents.setName(name)
//            contents.setEmail(email)
//            contents.setMobileNo(mobile)


            txt_name.setText(name)
            txt_email.setText(email)
            txt_mobNo.setText(mobile)

        }
    }

}