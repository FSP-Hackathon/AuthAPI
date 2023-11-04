package com.monitoring.api.model.repository

import com.monitoring.api.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo: JpaRepository<User, Long> {
    fun findByNickname(nickname: String): User?
}