package com.og.fj.lockerapp.ui.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import com.og.fj.lockerapp.data.bo.WearBO
import com.og.fj.lockerapp.repository.WearRepository

class WearViewModel : ViewModel() {

    private val mRepository: WearRepository = WearRepository()

    fun getWears(context: Context): LiveData<List<WearBO>> {
        return mRepository.getWears(context)
    }

}