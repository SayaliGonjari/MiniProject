package com.project.miniproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.miniproject.bean.CountryStateBean

class DisplayListViewContents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_list_view_contents)
        val recycleViewList = findViewById(R.id.list) as RecyclerView

        recycleViewList.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val countryList = ArrayList<CountryStateBean>()


        countryList.add(CountryStateBean("Andhra Pradesh", "Hyderabad"))
        countryList.add(CountryStateBean("Arunachal Pradesh", "Itanagar"))
        countryList.add(CountryStateBean("Assam", "Dispur"))
        countryList.add(CountryStateBean("Bihar", "Patna"))
        countryList.add(CountryStateBean("Maharashtra", "Mumbai"))
        countryList.add(CountryStateBean("Goa", "Panaji"))
        countryList.add(CountryStateBean("Chhattisgarh", "Raipur"))
        countryList.add(CountryStateBean("Gujarat", "Gandhinagar"))
        countryList.add(CountryStateBean("Haryana", "Chandigarh"))
        countryList.add(CountryStateBean("Himachal Pradesh", "Shimla"))
        countryList.add(CountryStateBean("Jharkhand", "Ranchi"))
        countryList.add(CountryStateBean("Karnataka", "Bengaluru (formerly Bangalore)"))
        countryList.add(CountryStateBean("Kerala", "Thiruvananthapuram"))
        countryList.add(CountryStateBean("Madhya Pradesh", "Bhopal"))
        countryList.add(CountryStateBean("Manipur", "Imphal"))

        val stateCapitalAdapter = StateCapitalAdapter(countryList)

        recycleViewList.adapter = stateCapitalAdapter
    }

}
