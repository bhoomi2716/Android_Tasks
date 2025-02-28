package com.example.projectsignupandsigninandcrud

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import okhttp3.Response
import retrofit2.Call
import retrofit2.Callback

class UpdateProduct : AppCompatActivity()
{
    lateinit var updatename : EditText
    lateinit var updateprice : EditText
    lateinit var updatedesc : EditText
    lateinit var updatestatus : EditText
    lateinit var updatebtn : Button
    lateinit var apiInterface: ApiInterface
    var id = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_product)

        updatename = findViewById(R.id.updateproductname)
        updateprice = findViewById(R.id.updateproductprice)
        updatedesc = findViewById(R.id.updateproductdesc)
        updatestatus = findViewById(R.id.updateproductstatus)
//        addimg = findViewById(R.id.addproductimg)
        updatebtn = findViewById(R.id.updateproductBtn)
        apiInterface = ApiClient().getapiclient().create(ApiInterface::class.java)

        var i = intent
        id = i.getIntExtra("id",101)
        var pname = i.getStringExtra("pname")
        var pprice = i.getStringExtra("pprice")
        var pdesc = i.getStringExtra("pdes")
        var pstatus = i.getStringExtra("pstatus")

        updatename.setText(pname)
        updateprice.setText(pprice)
        updatedesc.setText(pdesc)
        updatestatus.setText(pstatus)

        updatebtn.setOnClickListener {

            var name = updatename.text.toString()
            var price = updateprice.text.toString()
            var desc = updatedesc.text.toString()
            var status = updatestatus.text.toString()

            var call: Call<Void> = apiInterface.UpdateProduct(id,name,price,desc,status)

            call.enqueue(object:Callback<Void>
            {
                override fun onResponse(call: Call<Void>, response: retrofit2.Response<Void>) {

                    Toast.makeText(applicationContext, "Updated", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(applicationContext,ViewProduct::class.java))
                }

                override fun onFailure(call: Call<Void>, t: Throwable) {

                    Toast.makeText(applicationContext, "No Internet", Toast.LENGTH_SHORT).show()

                }
            })
        }
    }
}