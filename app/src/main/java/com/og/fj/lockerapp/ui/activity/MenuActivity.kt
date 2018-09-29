package com.og.fj.lockerapp.ui.activity

import android.support.v4.app.Fragment
import com.og.fj.lockerapp.ui.fragment.MenuFragment

class MenuActivity : BaseActivity() {

    override fun initialize() {
        // TODO
    }

    override fun fragment(): Fragment {
        return MenuFragment.newInstance()
    }

}
