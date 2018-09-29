package com.og.fj.lockerapp.ui.fragment

import com.og.fj.lockerapp.R

class DiaryFragment : BaseFragment() {

    companion object {
        fun newInstance(): DiaryFragment {
            return DiaryFragment()
        }
    }

    override fun initialize() {
        // TODO
    }

    override fun layout(): Int {
        return R.layout.fragment_diary
    }

}