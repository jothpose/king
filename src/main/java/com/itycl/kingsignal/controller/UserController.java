package com.itycl.kingsignal.controller;

import com.itycl.kingsignal.entity.User;
import com.itycl.kingsignal.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.View;
import java.util.List;

@RestController
@RequestMapping("/king")
public class UserController {
    @Autowired
    private UserService userService;


@RequestMapping("/userManager")
    public ModelAndView userList(){
    ModelAndView mv=new ModelAndView();
    List<User> userList = userService.findUserList();
    mv.addObject("userList",userList);
    mv.setViewName("userManager");
    return mv;
}
@RequestMapping("/deleteUser")
    public ModelAndView deleteUser(@Param("id")int id){
    ModelAndView mav=new ModelAndView();
    userService.deleteUserById(id);
    mav.setViewName("userManager");
    return mav;
}
}
