package esra.korkmaz.bitirme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class bitkim2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitkim2)

        val intent=intent
        var resim=findViewById<ImageView>(R.id.imageView)
        var yaz=findViewById<TextView>(R.id.textView)
        var yaz2 =findViewById<TextView>(R.id.textView2)
        var yaz3 =findViewById<TextView>(R.id.textView3)
        var text=intent.getStringExtra("anahtar")
        var text2=intent.getStringExtra("anahtar2")
        var text3=intent.getStringExtra("anahtar3")
        yaz2.text=text
        yaz.text=text2
        yaz3.text=text3



        if (text == "Papatya"){
            resim.setImageResource(R.drawable.papatya)
        }else if(text == "Lale"){
            resim.setImageResource(R.drawable.gul)
        }else if(text == "GÜl"){
            resim.setImageResource(R.drawable.gul)
        }else if(text == "Menekşe"){
            resim.setImageResource(R.drawable.mkse)
        }else if(text == "Lavanta"){
            resim.setImageResource(R.drawable.lavanta)
        }else if(text == "Çilek"){
            resim.setImageResource(R.drawable.cilek)
        }else if(text == "Biber"){
            resim.setImageResource(R.drawable.biber)
        }else if(text == "Domates"){
            resim.setImageResource(R.drawable.domates)
        }else if(text == "Patates"){
            resim.setImageResource(R.drawable.patates)
        }else if(text == "Kaktüs"){
            resim.setImageResource(R.drawable.kaktus)
        }else if(text == "Petra"){
            resim.setImageResource(R.drawable.petra)
        }else if(text == "Echeveria"){
            resim.setImageResource(R.drawable.echeveria)
        }else if(text == "Çam Ağacı"){
            resim.setImageResource(R.drawable.cam)
        }else if(text == "Akçaağaç"){
            resim.setImageResource(R.drawable.akcaagac)
        }else if(text == "Zeytin Ağacı"){
            resim.setImageResource(R.drawable.zeytin)
        }else if(text == "Kamkat Ağacı"){
            resim.setImageResource(R.drawable.kamkat)
        }else if(text == "Limon Ağacı"){
            resim.setImageResource(R.drawable.limon)
        }else if(text == "Nane"){
            resim.setImageResource(R.drawable.nane)
        }else if(text == "Maydanoz"){
            resim.setImageResource(R.drawable.maydonoz)
        }else if(text == "Semiz Otu"){
            resim.setImageResource(R.drawable.semiz)
        }else if(text == "Isırgan Otu"){
            resim.setImageResource(R.drawable.isirgan)
        }else if(text == "Bambu"){
            resim.setImageResource(R.drawable.bambu)
        }else if(text == "Orkide"){
            resim.setImageResource(R.drawable.orkide)
        }else if(text == "Zencefil"){
            resim.setImageResource(R.drawable.zencefil)
        }else if(text == "Ananas"){
            resim.setImageResource(R.drawable.ananas)
        }
    }
}