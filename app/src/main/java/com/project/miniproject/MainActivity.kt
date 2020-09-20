package com.project.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this@MainActivity, "Welcome to the Activity", Toast.LENGTH_SHORT).show()

        btn_AlertDialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Alert")
            alertDialog.setMessage("Alert Message")
            alertDialog.setIcon(android.R.drawable.arrow_up_float)

            alertDialog.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(this@MainActivity, "Clicked on Yes !!!!!!!", Toast.LENGTH_SHORT).show()
            }

            alertDialog.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(this@MainActivity, "Click on No !!!!!!", Toast.LENGTH_SHORT).show()
            }


            val builder: AlertDialog = alertDialog.create()
            builder.setCancelable(false)
            builder.show()

            builder.setCanceledOnTouchOutside(true)

        }

        btn_listView.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MainActivity, DisplayListViewContents::class.java))

        })

        btn_userData.setOnClickListener(View.OnClickListener {
            intent = Intent(this@MainActivity, ShareUserData::class.java)
            intent.putExtra("Name", "John");
            intent.putExtra("Email", "sayali@gmail.com");
            intent.putExtra("MobileNo", "1234567895");
            startActivity(intent)
        })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            


            R.id.css -> Toast.makeText(this, "Clicked on CSS", Toast.LENGTH_SHORT).show()
            R.id.bootstrap -> Toast.makeText(this, "Clicked on BootStrap", Toast.LENGTH_SHORT)
                    .show()
            R.id.html -> Toast.makeText(this, "Clicked on HTML", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}