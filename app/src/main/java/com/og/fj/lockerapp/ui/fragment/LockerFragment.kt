package com.og.fj.lockerapp.ui.fragment

import android.support.v7.widget.StaggeredGridLayoutManager
import com.og.fj.lockerapp.R
import kotlinx.android.synthetic.main.fragment_locker.*

const val LOCKER_SPAN = 3

class LockerFragment : BaseFragment() {

    companion object {
        fun newInstance(): LockerFragment {
            return newInstance()
        }
    }

    override fun initialize() {
        lockerList.layoutManager = StaggeredGridLayoutManager(LOCKER_SPAN,
                StaggeredGridLayoutManager.VERTICAL)
    }

    override fun layout(): Int {
        return R.layout.fragment_locker
    }

}