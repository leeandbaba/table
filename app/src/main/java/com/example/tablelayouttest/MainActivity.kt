package com.example.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableRow
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    button1.setOnClickListener{
        val name = name.text.toString()
        val version = version.text.toString()
        val tableRow = TableRow(this)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)
        val buttonName = Button(this)
        buttonName.text =name;
        tableRow.addView(buttonName,1)
        val buttonVersion = Button(this)
        buttonVersion.text =name;
        tableRow.addView(buttonVersion,2)
        tablelayout.addView(tableRow)
    }

    }
}