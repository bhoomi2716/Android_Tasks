package com.example.menuexample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {

    lateinit var contextbtn : Button
    lateinit var popupbtn : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        contextbtn=findViewById(R.id.context_id)
        popupbtn=findViewById(R.id.popup_id)

        registerForContextMenu(contextbtn)

        popupbtn.setOnClickListener {
            var popup= PopupMenu(applicationContext,popupbtn)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.setOnMenuItemClickListener(this)
            popup.show()
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        menuInflater.inflate(R.menu.context_menu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.contextmenu->
            {
                var shareContent = "This is the context Button to share!"
                var shareIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, shareContent)
                }
                startActivity(Intent.createChooser(shareIntent, "Share Me"))
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean
    {
        if (item != null)
        {
            when(item.itemId)
            {
                R.id.makecall->
                {
                    var callIntent = Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse("tel:+917820080017")
                    }
                    startActivity(callIntent)
                }

                R.id.sms->
                {
                    val smsIntent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse("sms:+917820080017")
                        putExtra("sms_body","You Send SMS")
                    }
                    startActivity(smsIntent)
                }
            }
        }
        return false
    }
}