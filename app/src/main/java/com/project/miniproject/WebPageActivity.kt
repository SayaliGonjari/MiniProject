package com.project.miniproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_web_page.*
import java.net.URI

class WebPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)

        val stringList = arrayOf("Google", "FaceBook", "Gmail")
        val edt_url = findViewById(R.id.edt_url) as EditText

        btn_Search.setOnClickListener(View.OnClickListener {
            val url: String = edt_url.text.toString().trim()
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://$url"))
            startActivity(intent)

        })

    }
}