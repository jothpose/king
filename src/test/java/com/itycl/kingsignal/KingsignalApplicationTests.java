package com.itycl.kingsignal;

import com.itycl.kingsignal.entity.User;
import com.itycl.kingsignal.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KingsignalApplicationTests {
@Autowired(required = true)
private UserMapper userMapper;
    @Test
    public void contextLoads() {
        userMapper.insert("姚景芹","123456");
        List<User> users = userMapper.findUserList();
        for(User u:users){
            System.out.println(u);
        }
    }
@Test
    public void  test1(){
        User u=userMapper.findUserById(2);
        u.setName("123");
        u.setPassword("123");
        userMapper.updateUser(u);

        System.out.println(u);
}
@Test
    public void test2(){
        userMapper.deleteUserById(2);
}
}
