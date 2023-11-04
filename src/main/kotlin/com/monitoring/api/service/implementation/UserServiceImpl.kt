package com.monitoring.api.service.implementation

import com.monitoring.api.model.entity.User
import com.monitoring.api.model.repository.UserRepo
import com.monitoring.api.service.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.slf4j.LoggerFactory
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

@Service
@Transactional
class UserServiceImpl(
    private val userRepo: UserRepo,
) : UserService, UserDetailsService {
    private val log = LoggerFactory.getLogger(this::class.java)

    override fun saveUser(user: User): User {
        return userRepo.save(user)
    }

    override fun isUserValid(nickname: String): Boolean {
        return userRepo.findByNickname(nickname) != null
    }

    override fun getUser(username: String): User? {
        log.info("Fetching user {}", username)
        return userRepo.findByNickname(username)
    }

    override fun getUsers(): List<User> {
        log.info("Fetching all users")
        return userRepo.findAll()
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        TODO("Not yet implemented")
    }
}