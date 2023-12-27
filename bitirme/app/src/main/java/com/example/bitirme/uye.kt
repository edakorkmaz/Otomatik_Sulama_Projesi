package com.example.bitirme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bitirme.databinding.ActivityUyeBinding
import com.google.firebase.auth.FirebaseAuth

class uye : AppCompatActivity() {
    private lateinit var binding: ActivityUyeBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUyeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        binding.button3.setOnClickListener {
            val  pass=binding.sifrekayTtextedit.text.toString();
            val confirmpass=binding.sifrekontroltextedit.text.toString();
            val email=binding.tcnoedittext.text.toString();
            if (email.isNotEmpty() && pass.isNotEmpty() && confirmpass.isNotEmpty()){
                if (pass== confirmpass){
                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this,"kayıt başarılı", Toast.LENGTH_SHORT).show()
                            val intent= Intent(this,giris::class.java)
                            startActivity(intent)
                        }else{
                            Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }

                }else{
                    Toast.makeText(this,"sifre aynı değil!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"boş alan bırakmayınız!!", Toast.LENGTH_SHORT).show()
            }









        }

    }
}