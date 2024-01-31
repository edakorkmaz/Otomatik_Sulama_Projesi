package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class agaclar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agaclar)
        var cam = findViewById<CardView>(R.id.cam)
        var akca = findViewById<CardView>(R.id.akca)
        var zeytin = findViewById<CardView>(R.id.zeytin)
        var kamkat = findViewById<CardView>(R.id.kamkat)
        var limon = findViewById<CardView>(R.id.limon)



        cam.setOnClickListener{
            var anahtar= "Çam Ağacı"
            var anahtar2= "Agac "
            var anahtar3= "600"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        akca.setOnClickListener{
            var anahtar= "Akçaağaç"
            var anahtar2= "Agac "
            var anahtar3= "600"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        zeytin.setOnClickListener{
            var anahtar= "Zeytin Ağacı"
            var anahtar2= "Agac "
            var anahtar3= "600"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        kamkat.setOnClickListener{
            var anahtar= "Kamkat Ağacı"
            var anahtar2= "Agac "
            var anahtar3= "600"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        limon.setOnClickListener{
            var anahtar= "Limon Ağacı"
            var anahtar2= "Agac "
            var anahtar3= "600"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}