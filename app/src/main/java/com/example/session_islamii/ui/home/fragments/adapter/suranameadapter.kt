package com.example.session_islamii.ui.home.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.session_islamii.R

class suranameadapter(val items: List<String>) :
    RecyclerView.Adapter<suranameadapter.viewholder>() {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val name: TextView = itemview.findViewById(R.id.chapter_name_label)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chapter_name, parent, false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val suraname = items.get(position)
        holder.name.setText(suraname)
        if (onitemclicklistener != null) {
            holder.itemView.setOnClickListener {
                onitemclicklistener?.onitemClick(position, suraname)
            }
        }
    }

    override fun getItemCount(): Int = items.size
    interface OnItemclickListener {
        fun onitemClick(pos: Int, name: String)
    }

    var onitemclicklistener: OnItemclickListener? = null
}

