package com.itycl.kingsignal.service.serviceImp;

import com.itycl.kingsignal.entity.User;
import com.itycl.kingsignal.mapper.UserMapper;
import com.itycl.kingsignal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUser(user);
    }
}
