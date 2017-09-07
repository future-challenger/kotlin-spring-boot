package com.example.demo

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import com.example.demo.UserInfo

@Mapper
interface UserMapper {

    @Select("""<script>
        select USER_ID, USER_NAME, PASSWORD, DELETED from user where 1=1
        <if test='username != null'>AND USER_NAME like #{username}%</if>
        <if test='userId != null'> AND USER_ID = #{userId}</if>
        <if test='deleted != null'> AND DELETED = #{deleted}</if>
        </script>""")
    fun queryUserList(userInfo: UserInfo): List<UserInfo>

    @Insert("""
        insert into user (USER_NAME, PASSWORD, DELETED)
            values (#{username}, #{password}, #{deleted})
        """)
    fun insertUser(userInfo: UserInfo): Int
}