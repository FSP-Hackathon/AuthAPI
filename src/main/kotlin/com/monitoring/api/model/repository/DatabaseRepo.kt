package com.monitoring.api.model.repository

import com.monitoring.api.model.entity.Database
import org.springframework.data.jpa.repository.JpaRepository

interface DatabaseRepo: JpaRepository<Database, Long> {
    fun findDatabaseByName(name: String): Database?
}