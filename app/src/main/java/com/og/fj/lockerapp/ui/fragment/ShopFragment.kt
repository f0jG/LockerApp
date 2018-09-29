package com.og.fj.lockerapp.ui.fragment

import com.og.fj.lockerapp.R

class ShopFragment : BaseFragment() {

    companion object {
        fun newInstance(): ShopFragment {
            return ShopFragment()
        }
    }

    override fun initialize() {
        // TODO
    }

    override fun layout(): Int {
        return R.layout.fragment_shop
    }
}