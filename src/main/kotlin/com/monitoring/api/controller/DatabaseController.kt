package com.monitoring.api.controller

import com.monitoring.api.model.dto.UsersResponse
import com.monitoring.api.model.entity.Database
import com.monitoring.api.service.DatabaseService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DatabaseController(
    private val databaseService: DatabaseService
) {
    @GetMapping("/databases")
    fun getDatabases(): ResponseEntity<List<Database>> {
        return ResponseEntity.ok().body(databaseService.getDatabases())
    }

    @GetMapping("/database/users")
    fun getUsers(@RequestParam("name") name: String) : ResponseEntity<UsersResponse> {
        return ResponseEntity.ok().body(databaseService.getUsers(name))
    }
}