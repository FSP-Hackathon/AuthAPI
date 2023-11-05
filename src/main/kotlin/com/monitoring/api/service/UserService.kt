package com.monitoring.api.service

import com.monitoring.api.model.dto.DatabasesResponse
import com.monitoring.api.model.entity.User

interface UserService {
    fun saveUser(user: User): User
    fun isUserValid(nickname: String): Boolean
    fun getUser(username: String): User?
    fun getUsers(): List<User>
    fun getDatabases(nickname: String): DatabasesResponse?
}