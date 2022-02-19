package com.mstar004.retrofit_mvvm.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mstar004.retrofit_mvvm.R
import com.mstar004.retrofit_mvvm.model.Post
import kotlinx.android.synthetic.main.item_rv.view.*


class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private var myList = emptyList<Post>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.userId_txt.text = myList[position].userId.toString()
        holder.itemView.id_txt.text = myList[position].id.toString()
        holder.itemView.title_txt.text = myList[position].title
        holder.itemView.body_txt.text = myList[position].body
    }

    override fun getItemCount(): Int {
        return myList.size

    }

    fun setData(newList: List<Post>) {
        myList = newList
        notifyDataSetChanged()
    }
}