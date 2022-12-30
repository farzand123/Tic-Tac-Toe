package com.example.madproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.madproject.R
import com.example.madproject.TIC_TAC_TOE
import kotlinx.coroutines.NonCancellable.start
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    fun playtictactoe(view: View){
        val intent = Intent(this, TIC_TAC_TOE::class.java)
        startActivity(intent)
    }

}
