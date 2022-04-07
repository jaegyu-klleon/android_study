package com.example.jetpack_lib

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack_lib.databinding.ActivityMainBinding
import com.example.jetpack_lib.databinding.FragmentOneBinding
import com.example.jetpack_lib.databinding.ItemMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
//        val menuItem1: MenuItem? = menu?.add(0, 4, 0, "메뉴아이템")

        val menuItem = menu?.findItem(R.id.searchView)
        val searchView = menuItem?.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d("yeahh", "$query")
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Log.d("yeahh", "$newText")
                return true
            }
        })



        return super.onCreateOptionsMenu(menu)
    }
}

class OneFragment : Fragment() {
    lateinit var binding: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}

class MyViewHolder(val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root) {

}

class MyAdapter(val binding: ItemMainBinding) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            ItemMainBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }

}