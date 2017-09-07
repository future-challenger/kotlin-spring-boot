package com.example.demo

data class UserInfo(val userId: Long, var username: String?, var password: String?
                    , var deleted: Int = 0)