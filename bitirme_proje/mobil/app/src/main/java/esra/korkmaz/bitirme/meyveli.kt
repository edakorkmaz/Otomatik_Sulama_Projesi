package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class meyveli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meyveli)

        var cilek = findViewById<CardView>(R.id.cilek)
        var biber = findViewById<CardView>(R.id.biber)
        var domates = findViewById<CardView>(R.id.domates)
        var patates = findViewById<CardView>(R.id.patates)



        cilek.setOnClickListener{
            var anahtar= "Çilek"
            var anahtar2= "Meyveli "
            var anahtar3= "590"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        biber.setOnClickListener{
            var anahtar= "Biber"
            var anahtar2= "Meyveli "
            var anahtar3= "590"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        domates.setOnClickListener{
            var anahtar= "Domates"
            var anahtar2= "Meyveli "
            var anahtar3= "590"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        patates.setOnClickListener{
            var anahtar= "Patates"
            var anahtar2= "Meyveli "
            var anahtar3= "590"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}