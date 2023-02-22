package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = fetchData()
        val adapter = RVAdaptor(items)
        recyclerView.adapter = adapter
    }

    fun fetchData(): ArrayList<String> {
        val list = ArrayList<String>()
        for (i in 0 until 20) {
            list.add("Item $i")
        }
        return list
    }
}
