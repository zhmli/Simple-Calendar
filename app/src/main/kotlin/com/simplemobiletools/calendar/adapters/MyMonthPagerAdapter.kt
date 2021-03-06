package com.simplemobiletools.calendar.adapters

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

import com.simplemobiletools.calendar.Constants
import com.simplemobiletools.calendar.NavigationListener
import com.simplemobiletools.calendar.fragments.MonthFragment

class MyMonthPagerAdapter(fm: FragmentManager, private val mCodes: List<String>, private val mListener: NavigationListener) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int {
        return mCodes.size
    }

    override fun getItem(position: Int): Fragment {
        val bundle = Bundle()
        val code = mCodes[position]
        bundle.putString(Constants.DAY_CODE, code)

        val fragment = MonthFragment()
        fragment.arguments = bundle
        fragment.setListener(mListener)
        return fragment
    }
}
