package com.example.madproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Display : AppCompatActivity() {

    lateinit var playAgainButton: Button
    lateinit var homeButton: Button
    lateinit var playerTurn: TextView
    lateinit var playerNames: Array<String>
    var name=0
    var box1=0
    var box2=0
    var box3=0
    var box4=0
    var box5=0
    var box6=0
    var box7=0
    var box8=0
    var box9=0
    var winner=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        playAgainButton = findViewById<Button>(R.id.playAgainButton)
        homeButton = findViewById<Button>(R.id.homeButton)
        playerTurn = findViewById<TextView>(R.id.displayTurn)

        playerNames = intent.getStringArrayExtra("PLAYER_NAMES") as Array<String>
        playerTurn.text= playerNames[0].toString()

    }
    fun changename(view: View){
       if(winner==1){
           playerTurn.text=playerNames[0].toString()+" Has WON"
       }
        else if(winner==2){
           playerTurn.text=playerNames[1].toString()+" Has WON"
       }
       else if(winner==3){
           playerTurn.text="Its A Draw"
       }
        else{
           name++

           playerTurn.text= playerNames[name%2].toString()

       }

    }

    fun chechkwinner(){
     if((box1==1&&box2==1&&box3==1)||(box1==2&&box2==2&&box3==2)){
         var img=findViewById<ImageView>(R.id.winnerline1)
         img.setVisibility(View.VISIBLE)
     if(box1==1){
         winner=1
     }
         else if(box1==2){
         winner=2
     }
     }
     else if((box4==1&&box5==1&&box6==1)||(box4==2&&box5==2&&box6==2))  {
         var img=findViewById<ImageView>(R.id.winnerline2)
         img.setVisibility(View.VISIBLE)
         if(box1==1){
             winner=1
         }
         else if(box1==2){
             winner=2
         }
     }
     else if((box7==1&&box8==1&&box9==1)||(box7==2&&box8==2&&box9==2))  {
         var img=findViewById<ImageView>(R.id.winnerline3)
         img.setVisibility(View.VISIBLE)
         if(box7==1){
             winner=1
         }
         else if(box7==2){
             winner=2
         }
     }
     else if((box1==1&&box4==1&&box7==1)||(box1==2&&box4==2&&box7==2))  {
         var img=findViewById<ImageView>(R.id.winnerline4)
         img.setVisibility(View.VISIBLE)
         if(box1==1){
             winner=1
         }
         else if(box1==2){
             winner=2
         }
     }
     else if((box2==1&&box5==1&&box8==1)||(box2==2&&box5==2&&box8==2))  {
         var img=findViewById<ImageView>(R.id.winnerline5)
         img.setVisibility(View.VISIBLE)
         if(box2==1){
             winner=1
         }
         else if(box2==2){
             winner=2
         }
     }
     else if((box3==1&&box6==1&&box9==1)||(box3==2&&box6==2&&box9==2))  {
         var img=findViewById<ImageView>(R.id.winnerline6)
         img.setVisibility(View.VISIBLE)
         if(box3==1){
             winner=1
         }
         else if(box3==2){
             winner=2
         }
     }

     else if((box1==1&&box5==1&&box9==1)||(box1==2&&box5==2&&box9==2))  {
         var img=findViewById<ImageView>(R.id.winnerline7)
         img.setVisibility(View.VISIBLE)
         if(box1==1){
             winner=1
         }
         else if(box1==2){
             winner=2
         }
     }

     else if((box3==1&&box5==1&&box7==1)||(box3==2&&box5==2&&box7==2))  {
         var img=findViewById<ImageView>(R.id.winnerline8)
         img.setVisibility(View.VISIBLE)
         if(box3==1){
             winner=1
         }
         else if(box3==2){
             winner=2
         }
     }
     else if((box1==1||box1==2)&&(box2==1||box2==2)&&(box3==1||box3==2)&&(box4==1||box4==2)&&(box5==1||box5==2)&&(box6==1||box6==2)&&(box7==1||box7==2)&&(box8==1||box8==2)&&(box9==1||box9==2)){
      winner=3
     }
    }
    fun changebox1(view: View){
        var box= findViewById<TextView>(R.id.box1)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box.text="X"
                box1=1

            }
            else{
                box.text="0"
                box1=2

            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox2(view: View){
        var box= findViewById<TextView>(R.id.box2)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box.text="X"
                box2=1

            }
            else{
                box2=2
                box.text="0"

            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox3(view: View){
        var box= findViewById<TextView>(R.id.box3)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box3=1
                box.text="X"
            }
            else{
                box3=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox4(view: View){
        var box= findViewById<TextView>(R.id.box4)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box.text="X"
                box4=1
            }
            else{
                box4=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox5(view: View){
        var box= findViewById<TextView>(R.id.box5)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box.text="X"
                box5=1
            }
            else{
                box5=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox6(view: View){
        var box= findViewById<TextView>(R.id.box6)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box6=1
                box.text="X"
            }
            else{
                box6=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox7(view: View){
        var box= findViewById<TextView>(R.id.box7)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box.text="X"
                box7=1
            }
            else{
                box7=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox8(view: View){
        var box= findViewById<TextView>(R.id.box8)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box8=1
                box.text="X"
            }
            else{
                box8=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun changebox9(view: View){
        var box= findViewById<TextView>(R.id.box9)
        if(box.text==""&&winner==0){
            if(name%2==0){
                box9=1
                box.text="X"
            }
            else{
                box9=2
                box.text="0"
            }
            chechkwinner()
            changename(view);
        }
    }
    fun home(view: View){
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)

        finish()
    }
    fun playagain(view: View){
        val intent = intent
        finish()
        startActivity(intent)
    }
}