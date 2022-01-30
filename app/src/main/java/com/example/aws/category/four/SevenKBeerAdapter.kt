package com.example.aws.category.four

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aws.databinding.FourthCategoryItemBinding

class SevenKBeerAdapter(val context: FourthActivity, private val SevenKBeerItemArrayList: ArrayList<SevenKBeerItemData>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int =SevenKBeerItemArrayList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SevenKBeerViewHolder){
            holder.view(SevenKBeerItemArrayList[position])
            holder.itemView.setOnClickListener {
                itemClickListener.onClick(it,position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = FourthCategoryItemBinding.inflate(layoutInflater,parent,false)
        return SevenKBeerViewHolder(context,binding)
    }
    interface OnItemClickListener{
        fun onClick(v: View, position: Int)
    }
    fun setItemClickListener(onItemClickListener: OnItemClickListener){
        this.itemClickListener = onItemClickListener
    }
    private  lateinit var itemClickListener : OnItemClickListener



}