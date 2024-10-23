package com.example.animationhw

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationhw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
        binding.imageViewIV.startAnimation(animation)

        val buttonAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        binding.startAnimBtn.startAnimation(buttonAnimation)

        binding.startAnimBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}