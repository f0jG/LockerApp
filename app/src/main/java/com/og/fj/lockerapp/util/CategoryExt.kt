package com.og.fj.lockerapp.util

import com.og.fj.lockerapp.data.entity.CategoryEntity

fun CategoryEntity.default(): CategoryEntity {
    // TODO not hardcoded
    id = "1"
    name = "No category"
    return this
}