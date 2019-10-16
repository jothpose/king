package com.itycl.kingsignal.mapper;

import com.itycl.kingsignal.entity.User;
import org.apache.ibatis.annotations.*;
import sun.security.util.Password;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findUserList();
        //增加
    @Insert("insert into user (name,password)values(#{name},#{password})")
     int insert(@Param("name") String name,@Param("password") String password);
        //修改
    @Update("update user set name=#{name},password=#{password} where id=#{id}")
    void updateUser(User user);
       //查询
    @Select("select * from user where id=#{id}")
    User findUserById(@Param("id") int id);
       //删除
    @Delete("delete from user where id=#{id}")
    void  deleteUserById(@Param("id") int id);
}
