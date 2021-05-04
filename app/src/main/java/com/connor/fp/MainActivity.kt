package com.connor.fp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ammoButton = findViewById<Button>(R.id.ammoButton)
        val gunsInfo = findViewById<Button>(R.id.GunButton)
        val itemInfo = findViewById<Button>(R.id.ItemButton)

        ammoButton.setOnClickListener(){
            intent = Intent(this, AmmoInfo::class.java)
            startActivity(intent)
        }

        gunsInfo.setOnClickListener(){
            intent = Intent(this, GunsInfo::class.java)
            startActivity(intent)
        }
        itemInfo.setOnClickListener(){
            intent = Intent(this, ItemInfo::class.java)
            startActivity(intent)
        }
    }
}