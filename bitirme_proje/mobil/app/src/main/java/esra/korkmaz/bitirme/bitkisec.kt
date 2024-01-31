package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class bitkisec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitkisec)
        var card1 = findViewById<CardView>(R.id.card1)
        var card2 = findViewById<CardView>(R.id.card2)
        var card3 = findViewById<CardView>(R.id.card3)
        var card4 = findViewById<CardView>(R.id.card4)
        var card5 = findViewById<CardView>(R.id.card5)
        var card6 = findViewById<CardView>(R.id.card6)


        card1.setOnClickListener{
            val intent = Intent(this, cicek::class.java)
            startActivity(intent)
        }
        card2.setOnClickListener{
            val intent = Intent(this, skkulent::class.java)
            startActivity(intent)
        }
        card3.setOnClickListener{
            val intent = Intent(this, meyveli::class.java)
            startActivity(intent)
        }
        card4.setOnClickListener{
            val intent = Intent(this, agaclar::class.java)
            startActivity(intent)
        }
        card5.setOnClickListener{
            val intent = Intent(this, tropikal::class.java)
            startActivity(intent)
        }
        card6.setOnClickListener{
            val intent = Intent(this, otlar::class.java)
            startActivity(intent)
        }
    }
}