package com.example.foodstation

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactUs : AppCompatActivity() {

    lateinit var callimg : ImageView
    lateinit var emailimg : ImageView
    lateinit var calltxt : TextView
    lateinit var emailtxt : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_us)

        callimg=findViewById(R.id.CallIconIMG)
        emailimg=findViewById(R.id.EmailIconIMG)
        calltxt=findViewById(R.id.CallNumTXT)
        emailtxt=findViewById(R.id.EmailTXT)
        var emailsend: String = emailtxt.getText().toString()
        var callnum = calltxt.getText().toString()


        callimg.setOnClickListener {
            var callIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$callnum")
            }
            startActivity(callIntent)
        }


        emailimg.setOnClickListener {
            var emailintent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$emailsend")
            }
            startActivity(emailintent)
        }

    }
}