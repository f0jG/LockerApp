package com.og.fj.lockerapp.data.mapper

import com.og.fj.lockerapp.data.bo.WearBO
import com.og.fj.lockerapp.data.entity.WearEntity


fun WearBO.toEntity(): WearEntity {
    return WearEntity(id, name, category.toEntity(), photo)
}

fun List<WearBO>.toEntity(): List<WearEntity> {
    return map { it.toEntity() }
}

fun WearEntity.toBO(): WearBO {
    return WearBO(id, name, category.toBO(), photo)
}

fun List<WearEntity>.toBo(): List<WearBO> {
    return map {
        it.toBO()
    }
}