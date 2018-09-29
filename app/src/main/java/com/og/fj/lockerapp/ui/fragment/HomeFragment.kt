package com.og.fj.lockerapp.ui.fragment

import com.og.fj.lockerapp.R

class HomeFragment : BaseFragment() {

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun initialize() {
        // TODO
    }

    override fun layout(): Int {
        return R.layout.fragment_home
    }

}