package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class skkulent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skkulent)
        var kaktus = findViewById<CardView>(R.id.kaktus)
        var aloevera = findViewById<CardView>(R.id.cratonpetra)
        var echeveria = findViewById<CardView>(R.id.echeveria)


        kaktus.setOnClickListener{
            var anahtar= "Kaktüs"
            var anahtar2= "Skkulent"
            var anahtar3= "580"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        aloevera.setOnClickListener{
            var anahtar= "Petra"
            var anahtar2= "Skkulent"
            var anahtar3= "580"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        echeveria.setOnClickListener{
            var anahtar= "Echeveria"
            var anahtar2= "Skkulent"
            var anahtar3= "580"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}