package com.og.fj.lockerapp.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.og.fj.lockerapp.data.constant.CategoryValue
import com.og.fj.lockerapp.data.entity.CategoryEntity

@Dao
interface CategoryDAO {

    @Query("SELECT * from " + CategoryValue.TABLE_NAME)
    fun readAll(): List<CategoryEntity>

    @Insert(onConflict = REPLACE)
    fun insert(vararg data: CategoryEntity)

    @Delete
    fun delete(vararg data: CategoryEntity)

}