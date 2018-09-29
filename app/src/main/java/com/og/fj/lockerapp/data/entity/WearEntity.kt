package com.og.fj.lockerapp.data.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.og.fj.lockerapp.data.constant.CategoryValue
import com.og.fj.lockerapp.data.constant.DefaultValue
import com.og.fj.lockerapp.data.constant.WearValue
import com.og.fj.lockerapp.util.default
import java.util.*

@Entity(tableName = WearValue.TABLE_NAME)
data class WearEntity(@PrimaryKey val id: String,
                      @ColumnInfo(name = DefaultValue.COLUMN_NAME) var name: String?,
                      @ColumnInfo(name = CategoryValue.COLUMN) var category: CategoryEntity,
                      @ColumnInfo(name = WearValue.COLUMN_PHOTO) var photo: String?) {

    constructor() : this(UUID.randomUUID().toString(), null, CategoryEntity().default(), null)
}