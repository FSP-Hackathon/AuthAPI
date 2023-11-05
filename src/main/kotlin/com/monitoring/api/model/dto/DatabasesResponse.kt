package com.monitoring.api.model.dto

data class DatabasesResponse(
    val nickname: String,
    val databases: Iterable<String>
)