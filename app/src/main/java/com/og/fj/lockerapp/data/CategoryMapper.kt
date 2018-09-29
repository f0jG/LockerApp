package com.og.fj.lockerapp.data

import com.og.fj.lockerapp.data.bo.CategoryBO
import com.og.fj.lockerapp.data.entity.CategoryEntity

fun CategoryBO.toEntity(): CategoryEntity {
    return CategoryEntity(id, name)
}

fun List<CategoryBO>.toEntity(): List<CategoryEntity> {
    return map { it.toEntity() }
}

fun CategoryEntity.toBO(): CategoryBO {
    return CategoryBO(id, name)
}

fun List<CategoryEntity>.toBo(): List<CategoryBO> {
    return map {
        it.toBO()
    }
}