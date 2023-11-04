package com.monitoring.api.model.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.monitoring.api.model.dto.UsersResponse
import jakarta.persistence.*

@Entity
@Table(name = "databases")
data class Database(
    @Column var name: String,
    @Column val secretKey: String,
    @ManyToMany
    @JoinTable(
        name = "database_x_user",
        joinColumns = arrayOf(JoinColumn(name = "database_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "user_id"))
    )
    @JsonIgnoreProperties("databases")
    val users: List<User> = listOf()
) : AbstractEntity() {
    fun toUsersResponse() = UsersResponse(name, users.map { it.nickname })
}