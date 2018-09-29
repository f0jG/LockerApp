package com.og.fj.lockerapp.ui.fragment

import com.og.fj.lockerapp.R

class MenuFragment : BaseFragment() {

    companion object {
        fun newInstance(): MenuFragment {
            return MenuFragment()
        }
    }

    override fun initialize() {
        // TODO
    }

    override fun layout(): Int {
        return R.layout.fragment_menu
    }

}