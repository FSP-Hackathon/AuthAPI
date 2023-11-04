package com.monitoring.api.service

import com.monitoring.api.model.dto.UsersResponse
import com.monitoring.api.model.entity.Database

interface DatabaseService {
    fun getUsers(name: String): UsersResponse?
    fun getDatabases(): List<Database>
    fun verify(): Boolean
}