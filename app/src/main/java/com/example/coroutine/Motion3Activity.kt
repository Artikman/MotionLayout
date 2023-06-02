package com.example.coroutine

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firebase.databinding.ActivityMotion3Binding

class Motion3Activity : AppCompatActivity() {

    private var _binding: ActivityMotion3Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMotion3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingActionButton3.setOnClickListener {
            Motion4Activity.start(this)
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, Motion3Activity::class.java))
        }
    }
}