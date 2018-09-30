package com.og.fj.lockerapp.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.content.Context
import com.og.fj.lockerapp.data.bo.WearBO
import com.og.fj.lockerapp.data.db.AppDatabase
import com.og.fj.lockerapp.data.mapper.toBo

class WearRepository {

    private val wearData = MutableLiveData<List<WearBO>>()

    fun getWears(context: Context): LiveData<List<WearBO>> {
        wearData.value = AppDatabase.getInstance(context)?.wearDao()?.readAll()?.toBo()
        return wearData
    }

}