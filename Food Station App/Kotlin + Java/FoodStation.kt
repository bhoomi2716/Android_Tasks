package com.example.foodstation

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class FoodStation : AppCompatActivity()
{
    lateinit var toolbar : Toolbar
    lateinit var CldDrnkImg : ImageView
    lateinit var DosaImg : ImageView
    lateinit var FriesImg : ImageView
    lateinit var IceCremImg : ImageView
    lateinit var PaniPuriImg : ImageView
    lateinit var PinpplePastryImg : ImageView
    lateinit var PvBhjiImg : ImageView
    lateinit var PizaImg : ImageView
    lateinit var SmosaImg : ImageView
    lateinit var SndWichImg : ImageView

    lateinit var CldDrnkTxt : TextView
    lateinit var DosaTxt : TextView
    lateinit var FriesTxt : TextView
    lateinit var IceCremTxt : TextView
    lateinit var PaniPuriTxt : TextView
    lateinit var PinpplePastryTxt : TextView
    lateinit var PvBhjiTxt : TextView
    lateinit var PizaTxt : TextView
    lateinit var SmosaTxt : TextView
    lateinit var SndWichTxt : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_station)

        toolbar=findViewById(R.id.tool)
        setSupportActionBar(toolbar)

        CldDrnkImg=findViewById(R.id.colddrinks_img)
        DosaImg=findViewById(R.id.dosa_img)
        FriesImg=findViewById(R.id.frenchfries_img)
        IceCremImg=findViewById(R.id.icecream_img)
        PaniPuriImg=findViewById(R.id.panipuri_img)
        PinpplePastryImg=findViewById(R.id.pastry_img)
        PvBhjiImg=findViewById(R.id.pavbhaji_img)
        PizaImg=findViewById(R.id.pizza_img)
        SmosaImg=findViewById(R.id.samosa_img)
        SndWichImg=findViewById(R.id.sandwich_img)

        CldDrnkTxt=findViewById(R.id.colddrinks_txt)
        DosaTxt=findViewById(R.id.dosa_txt)
        FriesTxt=findViewById(R.id.frenchfries_txt)
        IceCremTxt=findViewById(R.id.icecream_txt)
        PaniPuriTxt=findViewById(R.id.panipuri_txt)
        PinpplePastryTxt=findViewById(R.id.pastry_txt)
        PvBhjiTxt=findViewById(R.id.pavbhaji_txt)
        PizaTxt=findViewById(R.id.pizza_txt)
        SmosaTxt=findViewById(R.id.samosa_txt)
        SndWichTxt=findViewById(R.id.sandwich_txt)

        CldDrnkImg.setOnClickListener {
            var intent=Intent(applicationContext,ColdDrinksIngredients::class.java)
            startActivity(intent)
        }

        DosaImg.setOnClickListener {
            var intent = Intent(applicationContext,DosaIngredients::class.java)
            startActivity(intent)
        }

        FriesImg.setOnClickListener {
            var intent = Intent(applicationContext,FrenchFriesIngredients::class.java)
            startActivity(intent)
        }

        IceCremImg.setOnClickListener {
            var intent = Intent(applicationContext,IceCreamIngredients::class.java)
            startActivity(intent)
        }

        PaniPuriImg.setOnClickListener {
            var intent = Intent(applicationContext,PaniPuriIngredients::class.java)
            startActivity(intent)
        }

        PinpplePastryImg.setOnClickListener {
            var intent = Intent(applicationContext,PineappleIngredients::class.java)
            startActivity(intent)
        }

        PvBhjiImg.setOnClickListener {
            var intent = Intent(applicationContext,PavBhajiIngredients::class.java)
            startActivity(intent)
        }

        PizaImg.setOnClickListener {
            var intent = Intent(applicationContext,PizzaIngredients::class.java)
            startActivity(intent)
        }

        SmosaImg.setOnClickListener {
            var intent = Intent(applicationContext,SamosaIngredients::class.java)
            startActivity(intent)
        }

        SndWichImg.setOnClickListener {
            var intent = Intent(applicationContext,SandwichIngredients::class.java)
            startActivity(intent)
        }

        CldDrnkTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        DosaTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        FriesTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        IceCremTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        PaniPuriTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        PinpplePastryTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        PvBhjiTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        PizaTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        SmosaTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }

        SndWichTxt.setOnClickListener {
            var url = "https://www.swiggy.com/"
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(url))
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.AboutUS_id->
            {
                var i = Intent(applicationContext,AboutUs::class.java)
                startActivity(i)
            }
        }

        when(item.itemId)
        {
            R.id.ContactUS_id->
            {
                var i = Intent(applicationContext,ContactUs::class.java)
                startActivity(i)
            }
        }

        when(item.itemId)
        {
            R.id.ShareApp_id->
            {
                var shareContent = "This is the content to share!" // Content to be shared
                var shareIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain" // MIME type for text content
                    putExtra(Intent.EXTRA_TEXT, shareContent) // Content to share
                }
                startActivity(Intent.createChooser(shareIntent, "Share via"))
            }
        }

        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed()
    {
        var alert= AlertDialog.Builder(this)
        alert.setTitle("Are You Sure Want To Exit ??")
        alert.setPositiveButton("Yes",
            {
                    dilgIntrfce : DialogInterface, msg : Int ->

                finishAffinity()
            })

        alert.setNegativeButton("No",
            { dilgIntrfce : DialogInterface, msg : Int->
                dilgIntrfce.cancel()
            })

        alert.show()
    }
}