package com.monitoring.api.service

import com.monitoring.api.model.entity.User

interface UserService {
    fun saveUser(user: User): User
    fun isUserValid(nickname: String): Boolean
    fun getUser(username: String): User?
    fun getUsers(): List<User>
}