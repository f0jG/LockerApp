package com.og.fj.lockerapp.data.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.og.fj.lockerapp.data.constant.CategoryValue
import com.og.fj.lockerapp.data.constant.DefaultValue
import java.util.*

@Entity(tableName = CategoryValue.TABLE_NAME)
data class CategoryEntity(@PrimaryKey var id: String,
                          @ColumnInfo(name = DefaultValue.COLUMN_NAME) var name: String?) {

    constructor() : this(UUID.randomUUID().toString(), null)
}