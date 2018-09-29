package com.og.fj.lockerapp.data.bo

import com.og.fj.lockerapp.data.entity.WearEntity

data class SuitBO(val id: String,
                  var wears: List<WearEntity>)