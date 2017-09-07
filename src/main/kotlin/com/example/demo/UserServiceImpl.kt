package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : IUserService {
    @Autowired
    lateinit var userMapper: UserMapper

    override fun queryUserList(userInfo: UserInfo): List<UserInfo> {
        return userMapper.queryUserList(userInfo);
    }

    override fun insertUser(userInfo: UserInfo): Int {
        return userMapper.insertUser(userInfo);
    }
}