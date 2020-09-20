package com.project.miniproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_context_menu.*

class ContextMenuActivity : AppCompatActivity() {

    val stringlist = arrayOf("C","C++","BootStrap","Python","kotlin","React Native")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)

        supportActionBar?.setTitle("Context Menu")

        val arrayAdpater:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,stringlist)
        listView.adapter = arrayAdpater;
        registerForContextMenu(listView)

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.Call -> Toast.makeText(this@ContextMenuActivity,"Clicked on Call Menu",Toast.LENGTH_SHORT).show()
            R.id.Call -> Toast.makeText(this@ContextMenuActivity,"Clicked on Call Menu",Toast.LENGTH_SHORT).show()
            R.id.Call -> Toast.makeText(this@ContextMenuActivity,"Clicked on Call Menu",Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

}