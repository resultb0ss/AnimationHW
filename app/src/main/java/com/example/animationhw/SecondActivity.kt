package com.example.animationhw

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.animationhw.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val titleAnimation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.move_from_down_to_up)
        binding.secondActivityTitleTV.startAnimation(titleAnimation)

        val combineAnimation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.move_up_to_down)
        binding.secondActivityLoginEditTextET.startAnimation(combineAnimation)
        binding.secondActivityPasswordEditTextET.startAnimation(combineAnimation)
        binding.secondActivitySignInButton.startAnimation(combineAnimation)

        binding.secondActivitySignInButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


    }
}