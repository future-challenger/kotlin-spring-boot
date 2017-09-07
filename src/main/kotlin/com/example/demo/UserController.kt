package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var userService: IUserService

    @GetMapping("/user/{userId}/id")
    fun queryUserById(@PathVariable userId: String): List<UserInfo> {
        var userInfo = UserInfo(userId = userId.toLong(), username = null,
                password = null)
        var userList = userService.queryUserList(userInfo)
        return userList
    }
}