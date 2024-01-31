package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class cicek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cicek)

        var papatya = findViewById<CardView>(R.id.papatya)
        var lale = findViewById<CardView>(R.id.lale)
        var gul = findViewById<CardView>(R.id.gul)
        var menekse = findViewById<CardView>(R.id.menekse)
        var lavanta = findViewById<CardView>(R.id.lavanta)



        papatya.setOnClickListener{
            var anahtar= "Papatya"
            var anahtar2= "Çiçek"
            var anahtar3= "550"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        lale.setOnClickListener{
            var anahtar= "Lale"
            var anahtar2= "Çiçek"
            var anahtar3= "550"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        gul.setOnClickListener{
            var anahtar= "Gül"
            var anahtar2= "Çiçek"
            var anahtar3= "550"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        menekse.setOnClickListener{
            var anahtar= "Menekse"
            var anahtar2= "Çiçek"
            var anahtar3= "550"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        lavanta.setOnClickListener{
            var anahtar= "Lavanta"
            var anahtar2= "Çiçek"
            var anahtar3= "550"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}