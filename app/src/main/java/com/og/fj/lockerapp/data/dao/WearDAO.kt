package com.og.fj.lockerapp.data.dao

import android.arch.persistence.room.*
import com.og.fj.lockerapp.data.constant.WearValue
import com.og.fj.lockerapp.data.entity.WearEntity

@Dao
interface WearDAO {

    @Query("SELECT * from " + WearValue.TABLE_NAME)
    fun readAll(): List<WearEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg data: WearEntity)

    @Delete
    fun delete(vararg data: WearEntity)

}