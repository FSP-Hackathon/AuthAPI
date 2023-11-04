package com.monitoring.api.service.implementation

import com.monitoring.api.model.dto.UsersResponse
import com.monitoring.api.model.entity.Database
import com.monitoring.api.model.repository.DatabaseRepo
import com.monitoring.api.service.DatabaseService
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class DatabaseServiceImpl(
    private val databaseRepo: DatabaseRepo,
) : DatabaseService {
    override fun getUsers(name: String): UsersResponse? {
        return databaseRepo.findDatabaseByName(name)?.toUsersResponse()
    }

    override fun getDatabases(): List<Database> {
        return databaseRepo.findAll()
    }

    override fun verify(): Boolean {
        TODO("Not yet implemented")
    }

}