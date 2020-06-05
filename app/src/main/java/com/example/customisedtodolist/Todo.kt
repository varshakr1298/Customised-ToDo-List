package com.example.customisedtodolist

import android.app.Fragment
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.customisedtodolist.ui.main.SectionsPagerAdapter
import androidx.fragment.app.Fragment as Fragment1

class Todo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "You have to do the checked ones today!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }
        inner class SectionsPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){
            override fun getItem(position: Int): androidx.fragment.app.Fragment {

                    if(position==0){
                        return HobbiesActivity()
                    }
                    else {
                        return WorkActivity()
                    }
            }


            override fun getCount(): Int {
                return 2
            }

            override fun getPageTitle(position: Int): CharSequence? {
                when(position){
                    0->return "Hobbies"
                    1->return "Work"
                }
                return null
            }

        }
}