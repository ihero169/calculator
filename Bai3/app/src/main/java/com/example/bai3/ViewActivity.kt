package com.example.bai3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bai3.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityViewBinding
    private lateinit var sqlHelper: SqlHelper
    private val detailsAdapter by lazy {
        DetailsAdapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityViewBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        sqlHelper = SqlHelper(this@ViewActivity)
        val userList = sqlHelper.getAllUser()
        detailsAdapter.setItems(userList)
        viewBinding.rcv.apply {
            adapter = detailsAdapter
        }
    }
}