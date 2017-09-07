package com.example.demo

interface IUserService{
    fun queryUserList(userInfo: UserInfo): List<UserInfo>
    fun insertUser(userInfo: UserInfo): Int
}