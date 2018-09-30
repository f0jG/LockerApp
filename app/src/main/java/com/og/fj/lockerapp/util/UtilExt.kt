package com.og.fj.lockerapp.util

import android.text.TextUtils
import android.widget.ImageView
import com.bumptech.glide.Glide
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

fun ImageView.loadUrl(url: String?, placeHolder: Int) {
    if (TextUtils.isEmpty(url)) {
        Glide.with(this.context).load(placeHolder).into(this)
    } else {
        Glide.with(this.context).load(url).into(this)
    }
}