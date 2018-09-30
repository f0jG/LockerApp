package com.og.fj.lockerapp.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.og.fj.lockerapp.R
import com.og.fj.lockerapp.data.bo.WearBO
import com.og.fj.lockerapp.util.loadUrl
import kotlinx.android.synthetic.main.row_wear.view.*

class WearAdapter(val list: MutableList<WearBO>) : RecyclerView.Adapter<WearAdapter.WearViewHolder>() {

    fun setData(newList: List<WearBO>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(view: ViewGroup, position: Int): WearViewHolder {
        return WearViewHolder(LayoutInflater
                .from(view.context)
                .inflate(R.layout.row_wear, view, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WearViewHolder, position: Int) {
        val current = list[position]
        holder.titleLabel.text = current.name
        holder.categoryLabel.text = current.category.name
        // TODO search placeholder
        holder.photo.loadUrl(current.photo, R.drawable.ic_menu_home)
    }

    class WearViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleLabel = view.rowWearLabelTitle
        val categoryLabel = view.rowWearLabelCategory
        val photo = view.rowWearImg
    }

}