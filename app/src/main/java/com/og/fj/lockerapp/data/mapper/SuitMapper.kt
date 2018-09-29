package com.og.fj.lockerapp.data.mapper

import com.og.fj.lockerapp.data.bo.SuitBO
import com.og.fj.lockerapp.data.entity.SuitEntity

fun SuitBO.toEntity(): SuitEntity {
    return SuitEntity(id, wears)
}

fun List<SuitBO>.toEntity(): List<SuitEntity> {
    return map { it.toEntity() }
}

fun SuitEntity.toBO(): SuitBO {
    return SuitBO(id, wears)
}

fun List<SuitEntity>.toBo(): List<SuitBO> {
    return map {
        it.toBO()
    }
}