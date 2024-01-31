package esra.korkmaz.bitirme

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.Handler
import android.widget.Button
import android.widget.TextView
import esra.korkmaz.bitirme.databinding.ActivityGirisBinding
import esra.korkmaz.bitirme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val intent= Intent(this,giris::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            val intent= Intent(this,uye::class.java)
            startActivity(intent)
        }

    }

}