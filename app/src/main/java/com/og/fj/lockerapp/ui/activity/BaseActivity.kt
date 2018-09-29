package com.og.fj.lockerapp.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.og.fj.lockerapp.R
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        setFragment(fragment())
        initialize()
    }

    private fun setFragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.add(mainContainer.id, fragment).commit()
    }

    abstract fun initialize()

    abstract fun fragment(): Fragment

}