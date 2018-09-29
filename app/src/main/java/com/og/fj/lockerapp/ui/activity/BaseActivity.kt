package com.og.fj.lockerapp.ui.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.og.fj.lockerapp.R
import com.og.fj.lockerapp.ui.fragment.BaseFragment
import com.og.fj.lockerapp.util.setFragment
import kotlinx.android.synthetic.main.activity_base.*

abstract class BaseActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        setFragment(mainContainer.id, fragment())
        initialize()
    }

    fun setToolbarTitle(titleId: Int) {
        mainToolbar.title = getString(titleId)
    }

    abstract fun initialize()

    abstract fun fragment(): BaseFragment

}