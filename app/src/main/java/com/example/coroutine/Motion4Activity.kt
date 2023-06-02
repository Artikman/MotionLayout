package com.example.coroutine

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityMotion4Binding

class Motion4Activity : AppCompatActivity() {

    private var _binding: ActivityMotion4Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMotion4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton4.setOnClickListener {
            Motion5Activity.start(this)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, Motion4Activity::class.java))
        }
    }
}