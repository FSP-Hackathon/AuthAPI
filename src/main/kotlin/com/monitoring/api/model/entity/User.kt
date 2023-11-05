package com.monitoring.api.model.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.monitoring.api.model.dto.DatabasesResponse
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Column var nickname: String,
    @ManyToMany(mappedBy = "users")
    @JsonIgnoreProperties("users")
    val databases: List<Database> = listOf()
) : AbstractEntity() {
    fun toDatabasesResponse() = DatabasesResponse(nickname, databases.map { it.name })
}