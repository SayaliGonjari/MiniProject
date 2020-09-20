package com.project.miniproject

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.miniproject.bean.CountryStateBean

class StateCapitalAdapter(val list: ArrayList<CountryStateBean>) :
    RecyclerView.Adapter<StateCapitalAdapter.Stateholder>() {


    class Stateholder(itemview: View) : RecyclerView.ViewHolder(itemview) {


        fun bindItems(stateList: CountryStateBean) {
            val stateName = itemView.findViewById(R.id.State) as TextView
            val capitalName = itemView.findViewById(R.id.Capital) as TextView

            stateName.setText(stateList.stateName)
            capitalName.setText(stateList.capital)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Stateholder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.display_list_row, parent, false)
        return Stateholder((v))
    }

    override fun onBindViewHolder(holder: StateCapitalAdapter.Stateholder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}