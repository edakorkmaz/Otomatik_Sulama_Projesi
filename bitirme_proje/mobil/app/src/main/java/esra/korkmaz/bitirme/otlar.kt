package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class otlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otlar)
        var nane = findViewById<CardView>(R.id.nane)
        var maydanoz = findViewById<CardView>(R.id.maydanoz)
        var semiz = findViewById<CardView>(R.id.semiz)
        var isirgan = findViewById<CardView>(R.id.isirgan)
        nane.setOnClickListener{
            var anahtar= "Nane"
            var anahtar2= "Ot"
            var anahtar3= "500"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        maydanoz.setOnClickListener{
            var anahtar= "Maydanoz"
            var anahtar2= "Ot"
            var anahtar3= "500"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        semiz.setOnClickListener{
            var anahtar= "Semiz Otu"
            var anahtar2= "Ot"
            var anahtar3= "500"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
        isirgan.setOnClickListener{
            var anahtar= "Isırgan Otu"
            var anahtar2= "Ot"
            var anahtar3= "500"
            val gecis = Intent(this, acilisekrani::class.java)
            gecis.putExtra("aktar", anahtar)
            gecis.putExtra("aktar2", anahtar2)
            gecis.putExtra("aktar3", anahtar3)
            startActivity(gecis)
        }
    }
}