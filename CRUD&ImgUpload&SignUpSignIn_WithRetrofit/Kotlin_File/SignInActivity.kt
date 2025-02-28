package com.example.projectsignupandsigninandcrud

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode.Callback
import retrofit2.Call
import retrofit2.Response

class SignInActivity : AppCompatActivity()
{
    lateinit var emailsingnin : EditText
    lateinit var passwordsignin : EditText
    lateinit var signinBtn : Button
    lateinit var signuptxt : TextView
    lateinit var apiInterface: ApiInterface

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_activity)

        emailsingnin = findViewById(R.id.emailSiginIn)
        passwordsignin = findViewById(R.id.passwordSiginIn)
        signinBtn = findViewById(R.id.signinBtn)
        signuptxt = findViewById(R.id.signupTxt)

        apiInterface = ApiClient().getapiclient().create(ApiInterface::class.java)

        signinBtn.setOnClickListener {

            var email = emailsingnin.text.toString()
            var password = passwordsignin.text.toString()

            var call = apiInterface.SignIn(email,password)

            signuptxt.setOnClickListener {

                startActivity(Intent(applicationContext,SignUpActivity::class.java))
            }

            call.enqueue(object : retrofit2.Callback<Model>
            {
                override fun onResponse(call: Call<Model>, response: Response<Model>)
                {
                    Toast.makeText(applicationContext, "Login Done", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(applicationContext,ViewProduct::class.java))
                }

                override fun onFailure(call: Call<Model>, t: Throwable)
                {
                    Toast.makeText(applicationContext, "Login Fail", Toast.LENGTH_SHORT).show()
                }

            })
        }
    }
}