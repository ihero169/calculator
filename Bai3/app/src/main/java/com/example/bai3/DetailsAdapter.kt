package com.example.bai3

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.bai3.databinding.ItemDetailsBinding

class DetailsAdapter(
) : BaseAdapter<ItemDetailsBinding, User>()  {
    override fun getLayoutBinding(parent: ViewGroup, viewType: Int): ItemDetailsBinding {
        return ItemDetailsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    }

    override fun bind(binding: ItemDetailsBinding,
                      item: User,
                      position: Int) {
        binding.edtDob.text = item.dob
        binding.edtName.text = item.name
        binding.edtEmail.text = item.email
    }
}