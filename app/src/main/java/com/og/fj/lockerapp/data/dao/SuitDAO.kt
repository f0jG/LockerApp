package com.og.fj.lockerapp.data.dao

import android.arch.persistence.room.*
import com.og.fj.lockerapp.data.constant.SuitValue
import com.og.fj.lockerapp.data.entity.SuitEntity

@Dao
interface SuitDAO {

    @Query("SELECT * from " + SuitValue.TABLE_NAME)
    fun readAll(): List<SuitEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg data: SuitEntity)

    @Delete
    fun delete(vararg data: SuitEntity)

}