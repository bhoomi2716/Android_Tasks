package com.example.extratask

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.contains

class CallContextWithSearchView : AppCompatActivity()
{
    lateinit var list : ListView
    lateinit var CallList: MutableList<String>
    lateinit var srchviw : SearchView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.call_context_with_search_view)

        list=findViewById(R.id.callList)
        srchviw=findViewById(R.id.srchview)
        CallList=ArrayList()

        registerForContextMenu(list)

        CallList.add("101")
        CallList.add("102")
        CallList.add("103")
        CallList.add("104")
        CallList.add("105")

        var calladapter = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,CallList)
        list.adapter = calladapter

        srchviw.setOnQueryTextListener(object : SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(query: String?): Boolean
            {
                if(CallList.contains(query))
                {
                    calladapter.filter.filter(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean
            {

                calladapter.filter.filter(newText)
                return false
            }

        })

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        menuInflater.inflate(R.menu.call_context,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        var Call_acmi : AdapterView.AdapterContextMenuInfo = item.menuInfo as AdapterView.AdapterContextMenuInfo
        var Call_pos = Call_acmi.position

        when(item.itemId)
        {
            R.id.dialCall->
            {
                var callIntent = Intent(Intent.ACTION_DIAL).apply {
                    data = Uri.parse("tel:${CallList[Call_pos]}")
                }
                startActivity(callIntent)
            }
        }
        return super.onContextItemSelected(item)
    }

}