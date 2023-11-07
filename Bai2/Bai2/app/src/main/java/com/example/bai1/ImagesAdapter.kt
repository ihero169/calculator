package com.example.bai1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bai1.databinding.ItemViewImageBinding

class ImagesAdapter(
    private val context: Context,
    private val onClicked: (String) -> Unit,
): BaseAdapter<ItemViewImageBinding,String>() {


    override fun getLayoutBinding(parent: ViewGroup, viewType: Int): ItemViewImageBinding {
        return ItemViewImageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    }

    override fun bind(binding: ItemViewImageBinding, item: String, position: Int) {
        Glide.with(context)
            .load(this.getItem(position))
            .apply(RequestOptions().override(600, 200))
            .into(binding.imgCake);
    }
}