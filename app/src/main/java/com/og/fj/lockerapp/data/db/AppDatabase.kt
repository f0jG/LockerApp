package com.og.fj.lockerapp.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.og.fj.lockerapp.data.constant.DefaultValue
import com.og.fj.lockerapp.data.dao.CategoryDAO
import com.og.fj.lockerapp.data.dao.WearDAO
import com.og.fj.lockerapp.data.entity.CategoryEntity
import com.og.fj.lockerapp.data.entity.SuitEntity
import com.og.fj.lockerapp.data.entity.WearEntity

@Database(entities = [WearEntity::class, CategoryEntity::class, SuitEntity::class],
        version = DefaultValue.DATABASE_VERSION)
abstract class AppDatabase : RoomDatabase() {

    abstract fun wearDao(): WearDAO
    abstract fun categoryDao(): CategoryDAO

    companion object {
        private const val DB_NAME = "lockerapp.db"
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            AppDatabase::class.java, DB_NAME)
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}