package com.og.fj.lockerapp.util

import com.og.fj.lockerapp.ui.activity.BaseActivity
import com.og.fj.lockerapp.ui.fragment.BaseFragment

fun BaseActivity.setFragment(containerId: Int, baseFragment: BaseFragment) {
    val ft = supportFragmentManager.beginTransaction()
    ft.add(containerId, baseFragment).commit()
}

fun BaseFragment.setFragment(containerId: Int, baseFragment: BaseFragment) {
    val ft = activity?.supportFragmentManager?.beginTransaction()
    ft?.add(containerId, baseFragment)?.commit()
}