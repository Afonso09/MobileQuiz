package com.example.mobilequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_quiz.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val viewHolder = ViewHolder.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }
    fun setupViews() {
        viewHolder.buttonQuiz = findViewById<Button>(R.id.startQuizButton)
        viewHolder.buttonQuiz?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }
}


class ViewHolder {
    var buttonQuiz: Button? = null

    companion object Instance {
        fun create(): ViewHolder = ViewHolder()
    }
}