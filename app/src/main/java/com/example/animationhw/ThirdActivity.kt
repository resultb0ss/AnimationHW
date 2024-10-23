package com.example.animationhw

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationhw.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val combineAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.shake)
        binding.thirdActivityImageViewIV.startAnimation(combineAnimation)
    }
}