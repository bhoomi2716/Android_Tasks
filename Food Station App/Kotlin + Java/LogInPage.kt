package com.example.foodstation

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogInPage : AppCompatActivity()
{
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var login : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in_page)

        username=findViewById(R.id.usernameET)
        password=findViewById(R.id.passET)
        login=findViewById(R.id.loginbtn)

        login.setOnClickListener{

            var name=username.text.toString()
            var pass=password.text.toString()

            if(name.length==0 && pass.length==0)
            {
                username.setError("Please Enter Username")
                password.setError("Please Enter Password")
            }

            else if(name.length==0)
            {
                username.setError("Please Enter Username")
            }

            else if(pass.length==0)
            {
                password.setError("Please Enter Password")
            }

            else
            {
                if(name.equals("Bhoomi") && pass.equals("170204"))
                {
                    Toast.makeText(applicationContext,"Success Login",Toast.LENGTH_SHORT).show()
                    var i = Intent(applicationContext,FoodStation::class.java)
                    startActivity(i)
                }
                else
                {
                    Toast.makeText(applicationContext,"Invalid Username OR Password",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


    @SuppressLint("MissingSuperCall")
    override fun onBackPressed()
    {

        var alert=AlertDialog.Builder(this)
        alert.setTitle("Are You Sure Want To Exit ??")
        alert.setPositiveButton("Yes",
            {
                dilgIntrfce : DialogInterface, msg : Int ->

                finishAffinity()
        })

        alert.setNegativeButton("No",
            {dilgIntrfce : DialogInterface, msg : Int->
            dilgIntrfce.cancel()
        })

        alert.show()

        //super.onBackPressed()
    }
}