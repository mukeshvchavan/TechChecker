package com.example.myapp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rec_item.view.*
import java.util.ArrayList


class ExampleAdapter(
    private var exampleList: List<ExampleItem>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    inner class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView: TextView = itemView.text_view1

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rec_item,
            parent,false)
        return ExampleViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text
        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }
    }
    override fun getItemCount()=exampleList.size

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}