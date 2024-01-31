package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.firebase.auth.FirebaseAuth
import esra.korkmaz.bitirme.databinding.ActivityAcilisekraniBinding

class acilisekrani : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var binding: ActivityAcilisekraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acilisekrani)

        val intent=intent
        var text=intent.getStringExtra("aktar")
        var text2=intent.getStringExtra("aktar2")
        var text3=intent.getStringExtra("aktar3")


        //var bitkimm=findViewById<CardView>(R.id.bitkimcard)
        var card_cıkısyap=findViewById<CardView>(R.id.card_cıkısyap)
        var bitkisecc=findViewById<CardView>(R.id.card_randevuekle)
        //bitkimm.setOnClickListener{
           // val gecis = Intent(this, bitkim::class.java)
            //gecis.putExtra("anahtar",text)
           // gecis.putExtra("anahtar2",text2)
            //gecis.putExtra("anahtar3",text3)
            //startActivity(gecis)
       // }
        var bitkimm2=findViewById<TextView>(R.id.button4)
        var bitkimm3=findViewById<TextView>(R.id.cicek2)
        var bitkimm=findViewById<ImageView>(R.id.cicek)
        card_cıkısyap.setOnClickListener {
            firebaseAuth.signOut()
            val intent= Intent(this,giris::class.java)
            startActivity(intent)
        }

        bitkisecc.setOnClickListener{
            val gecis = Intent(this, bitkisec::class.java)
            startActivity(gecis)
        }
        bitkimm2.setOnClickListener{
            val gecis = Intent(this, bitkim2::class.java)
            gecis.putExtra("anahtar",text)
            gecis.putExtra("anahtar2",text2)
            gecis.putExtra("anahtar3",text3)
            startActivity(gecis)
        }
        bitkimm.setOnClickListener{
            val gecis = Intent(this, bitkim::class.java)
            gecis.putExtra("anahtar",text)
            gecis.putExtra("anahtar2",text2)
            gecis.putExtra("anahtar3",text3)
            startActivity(gecis)
        }
        bitkimm3.setOnClickListener{
            val gecis = Intent(this, bitkim3::class.java)
            startActivity(gecis)
        }
    }
}