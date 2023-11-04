package com.monitoring.api.model.dto

data class UsersResponse(
    val name: String,
    val users: Iterable<String>
)