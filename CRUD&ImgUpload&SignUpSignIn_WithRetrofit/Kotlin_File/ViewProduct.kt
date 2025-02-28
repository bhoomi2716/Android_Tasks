package com.example.projectsignupandsigninandcrud

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewProduct : AppCompatActivity() {
    lateinit var searchView: SearchView
    lateinit var addbtn: Button
    lateinit var recyclerView: RecyclerView
    lateinit var apiInterface: ApiInterface
    lateinit var itemlist: MutableList<ProductModel>
    lateinit var adapter: ProductAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_product)

        searchView = findViewById(R.id.searchview)
        addbtn = findViewById(R.id.addBtn)
        recyclerView = findViewById(R.id.recyclerview)
        itemlist = ArrayList()

        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        apiInterface = ApiClient().getapiclient().create(ApiInterface::class.java)

        val call: Call<List<ProductModel>> = apiInterface.ViweProduct()
        call.enqueue(object : Callback<List<ProductModel>>
        {
            override fun onResponse(call: Call<List<ProductModel>>, response: Response<List<ProductModel>>)
            {
                if (response.isSuccessful)
                {
                    itemlist = response.body() as MutableList<ProductModel>
                    adapter = ProductAdapter(applicationContext, itemlist)
                    recyclerView.adapter = adapter
                }
                else
                {
                    Toast.makeText(applicationContext, "Failed to load products", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<ProductModel>>, t: Throwable) {
                Toast.makeText(applicationContext, "No Internet", Toast.LENGTH_SHORT).show()
            }
        })

        addbtn.setOnClickListener {
            startActivity(Intent(applicationContext, AddProduct::class.java))
            finish()
        }
    }


    override fun onBackPressed() {
        finishAffinity()
        super.onBackPressed()
    }
}
