package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class tropikal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tropikal)
        var bambu = findViewById<CardView>(R.id.bambu)
        var orkide = findViewById<CardView>(R.id.orkide)
        var zencefil = findViewById<CardView>(R.id.zencefil)
        var vanilya = findViewById<CardView>(R.id.ananas)




        bambu.setOnClickListener{
            var anahtar= "Bambu"
            var anahtar2= "Tropikal"
            var anahtar3= "450"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        orkide.setOnClickListener{
            var anahtar= "Orkide"
            var anahtar2= "Tropikal"
            var anahtar3= "450"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        zencefil.setOnClickListener{
            var anahtar= "Zencefil"
            var anahtar2= "Tropikal"
            var anahtar3= "450"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        vanilya.setOnClickListener{
            var anahtar= "Ananas"
            var anahtar2= "Tropikal"
            var anahtar3= "450"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}