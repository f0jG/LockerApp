package com.og.fj.lockerapp.data.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.og.fj.lockerapp.data.constant.SuitValue
import java.util.*

@Entity(tableName = SuitValue.TABLE_NAME)
data class SuitEntity(@PrimaryKey var id: String,
                      @ColumnInfo(name = SuitValue.COLUMN_WEARS) var wears: List<WearEntity>) {

    constructor() : this(UUID.randomUUID().toString(), arrayListOf())

}