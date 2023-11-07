package com.example.bai3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bai3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMainBinding
    private lateinit var sql: SqlHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        sql = SqlHelper(context = this@MainActivity)
        viewBinding.btnAdd.setOnClickListener {
            val name = viewBinding.edtName.text.toString().trim()
            val dob = viewBinding.edtEmail.text.toString().trim()
            val email = viewBinding.edtDob.text.toString().trim()
            if (name.isNotEmpty() && dob.isNotEmpty() && email.isNotEmpty()) {
                val user = User(name = name, dob = dob, email = email)
                sql.addUser(user)
            }
        }
        viewBinding.btnView.setOnClickListener {
            val intent = Intent(this@MainActivity, ViewActivity::class.java)
            startActivity(intent)
        }
    }
}