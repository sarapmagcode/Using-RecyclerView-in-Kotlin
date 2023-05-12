package com.example.simpleaffirmationsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleaffirmationsapp.adapter.ItemAdapter
import com.example.simpleaffirmationsapp.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data
        val myDataSet = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        // Setting to improve performance
        // Changes in content do not change the layout of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}