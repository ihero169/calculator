package com.example.bai1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.bai1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private val transactionAdapter by lazy {
        ImagesAdapter(
            context = this@MainActivity,
            onClicked = ::onClicked,
        )
    }
    val MIN = 0
    val MAX = 3
    private val imageList = arrayListOf<String>(
        "https://images.pexels.com/photos/36753/flower-purple-lical-blosso.jpg?cs=srgb&dl=pexels-pixabay-36753.jpg&fm=jpg",
        "https://cdn.pixabay.com/photo/2013/07/21/13/00/rose-165819_640.jpg",
        "https://images.pexels.com/photos/56866/garden-rose-red-pink-56866.jpeg?cs=srgb&dl=pexels-pixabay-56866.jpg&fm=jpg",
        "https://wallpapers.com/images/featured/flower-pictures-unpxbv1q9kxyqr1d.jpg",
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        transactionAdapter.setItems(imageList)
        viewBinding.viewpager.apply {
            adapter = transactionAdapter
        }

        viewBinding.btnNext.setOnClickListener {
            if (viewBinding.viewpager.currentItem != MAX) {
                viewBinding.viewpager.setCurrentItem(viewBinding.viewpager.currentItem + 1, true)

            }
        }

        viewBinding.btnPre.setOnClickListener {
            if (viewBinding.viewpager.currentItem != MIN) {
                viewBinding.viewpager.setCurrentItem(viewBinding.viewpager.currentItem - 1, true)

            }
        }
    }
}

fun onClicked(s: String) {

}
