package com.example.extratask

import android.media.MediaPlayer
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class AnimalVoice : AppCompatActivity(), TextToSpeech.OnInitListener
{
    lateinit var listView: ListView
    lateinit var list: MutableList<String>
    lateinit var txttospech: TextToSpeech
    lateinit var midaplyrlion: MediaPlayer
    lateinit var midaplyrtiger: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal_voice)

        listView=findViewById(R.id.list)
        list=ArrayList()
        txttospech=TextToSpeech(applicationContext,this)
        midaplyrlion=MediaPlayer.create(applicationContext,R.raw.lionsound)
        midaplyrtiger=MediaPlayer.create(applicationContext,R.raw.tigersound)
        registerForContextMenu(listView)
        list.add("Lion")
        list.add("Tiger")

        var adapter = ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,list)
        listView.adapter = adapter
    }


    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?)
    {
        menuInflater.inflate(R.menu.context_menu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        var acmi : AdapterView.AdapterContextMenuInfo = item.menuInfo as AdapterView.AdapterContextMenuInfo
        var pos = acmi.position

        when(item.itemId)
        {
            R.id.speak->
            {
                txttospech.speak(list[pos].toString(),TextToSpeech.QUEUE_ADD,null)

            }
            R.id.sound->
            {
                if(pos==0)
                {
                    midaplyrlion.start()
                }
                if(pos==1)
                {
                    midaplyrtiger.start()
                }
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onInit(status: Int)
    {
        txttospech.setSpeechRate(1.00F)
        txttospech.setPitch(0.8F)
        txttospech.setLanguage(Locale.US)
    }
}