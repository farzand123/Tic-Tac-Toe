package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TIC_TAC_TOE : AppCompatActivity() {
    lateinit var player1t :TextView
    lateinit var player2t :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)
        player1t=findViewById(R.id.player1)
        player2t=findViewById(R.id.player2)
    }
    fun display(view: View){
        var player1Name=player1t.getText().toString()
        var player2Name=player2t.getText().toString()
        val intent = Intent(this, Display::class.java)
        intent.putExtra("PLAYER_NAMES", arrayOf<String>(player1Name, player2Name))
        startActivity(intent)

    }
}