package com.example.customisedtodolist.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.customisedtodolist.R

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if(position==0){
            return com.example.customisedtodolist.HobbiesActivity()
        }
        else {
            return com.example.customisedtodolist.WorkActivity()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0->return "Hobbies"
            1->return "Work"
        }
        return null
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}