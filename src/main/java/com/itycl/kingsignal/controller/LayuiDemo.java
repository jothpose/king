package com.itycl.kingsignal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/king")
public class LayuiDemo {


    @RequestMapping("/index")
//    @ResponseBody
    public String layuiTest(){
        /**
         * 这能加载出来就见鬼了
         * 说原因
         * 你想加载出来什么样子html啊
         * 哪个html
         * index
         * 这都没有注入进来嘛
         *注入进来了
         * 怪的很
         * 那就是配置问题
         * 看出来了吗
         * 等会儿，我看看
         * 应该就是哪儿没有配置对，但是我也找不出来，有没有仓库，你提上去github上面没，我下载下来看看
         * 等下，3分钟
         */
        System.out.println("11111111111111111111111111");
        return "index";
}

}

