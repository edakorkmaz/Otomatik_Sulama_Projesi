package esra.korkmaz.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import esra.korkmaz.bitirme.databinding.ActivityGirisBinding

class giris : AppCompatActivity() {

    private lateinit var binding: ActivityGirisBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGirisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()

        binding.button.setOnClickListener {
            val  email=binding.tcnoedittext.text.toString()
            val  pass=binding.sifreedittext.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty() ){
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this,"giriş başarılı", Toast.LENGTH_SHORT).show()
                        val intent=Intent(this,acilisekrani::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this,"boş alan bırakmayınız!!", Toast.LENGTH_SHORT).show()
            }
        }
        var button2=findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent= Intent(this,uye::class.java)
            startActivity(intent)
        }
    }
}