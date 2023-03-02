package com.example.cv3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

internal class ExperienceAdapter(val itemsList: ArrayList<Experience>) : RecyclerView.Adapter<ExperienceAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
        var itemImageView: ImageView = itemview.findViewById(R.id.myImageView)
        var itemCompanyName: TextView = itemview.findViewById(R.id.company_name)
        var itemDesc: TextView = itemview.findViewById(R.id.name)
        var itemEndDate: TextView = itemview.findViewById(R.id.endDate)
        var itemCompanyAddress: TextView = itemview.findViewById(R.id.company_address)
        var itemStartDate: TextView = itemview.findViewById(R.id.startDate)

    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.experience_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.itemImageView.setImageResource(item.imageItem);
        holder.itemCompanyAddress.text = item.companyAddress
        holder.itemEndDate.text = item.endDate
        holder.itemStartDate.text = item.startDate
        holder.itemCompanyName.text = item.companyName
        holder.itemDesc.text = item.description
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

}