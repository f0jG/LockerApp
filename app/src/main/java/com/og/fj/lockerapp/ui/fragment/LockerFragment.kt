package com.og.fj.lockerapp.ui.fragment

import android.arch.lifecycle.Observer
import android.support.v7.widget.StaggeredGridLayoutManager
import com.og.fj.lockerapp.R
import com.og.fj.lockerapp.data.bo.WearBO
import com.og.fj.lockerapp.ui.adapter.WearAdapter
import com.og.fj.lockerapp.ui.viewmodel.WearViewModel
import kotlinx.android.synthetic.main.fragment_locker.*

const val LOCKER_SPAN = 3

class LockerFragment : BaseFragment() {

    companion object {
        fun newInstance(): LockerFragment {
            return newInstance()
        }
    }

    private var mAdapter: WearAdapter? = null
    private var mViewModel: WearViewModel? = null

    override fun initialize() {
        buildAdapter()
        mViewModel = WearViewModel()
        setupObserver()
    }

    override fun layout(): Int {
        return R.layout.fragment_locker
    }

    private fun buildAdapter() {
        mAdapter = WearAdapter(arrayListOf())
        lockerList.adapter = mAdapter
        lockerList.layoutManager = StaggeredGridLayoutManager(LOCKER_SPAN,
                StaggeredGridLayoutManager.VERTICAL)
    }

    private fun setupObserver() {
        context?.let { context ->
            mViewModel?.getWears(context)?.observe(this, Observer<List<WearBO>> { list ->
                list?.let {
                    mAdapter?.setData(it)
                }
            })
        }
    }

}