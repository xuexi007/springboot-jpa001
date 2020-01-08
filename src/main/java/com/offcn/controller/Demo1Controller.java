package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class Demo1Controller {
    @RequestMapping("/demo1")
    public String demo1(Model model){
        String msg="hello Thymeleaf!";
        model.addAttribute("msg",msg);
        return "demo1";
    }

    @RequestMapping("/demo2")
    public String demo2(Model model){
        User user = new User(1L, "红烧肉", 100);
        model.addAttribute("user",user);

        Map map=new HashMap();
        map.put("address","北京五方桥基地");
        map.put("phone","14992211222");
        map.put("zipcode","1008971");
        map.put("pic","http://xue.ujiuye.com/uploads_it/1911/QuanGuo/EB11836046786FYU.jpg");
        model.addAttribute("map",map);
        return "demo2";
    }
    @RequestMapping("/demo3")
    public String demo3(Model model){
        List<User> list=new ArrayList<>();
        User user1 = new User(1L, "红烧肉", 100);
        User user2 = new User(2L, "烤羊腿", 500);
        User user3 = new User(3L, "肘子", 300);
        User user4 = new User(4L, "饺子", 80);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        model.addAttribute("list",list);

        return "demo3";


    }

    @RequestMapping("/demo4")
    public String demo4(Model model){
        model.addAttribute("userName","优就业");
        model.addAttribute("href","http://www.ujiuye.com");
        return "demo4";
    }
    @RequestMapping("/demo5")
    public String demo5(Model model){
        model.addAttribute("flag","no");
        model.addAttribute("menu","manager");
        model.addAttribute("manager","manager");
        return "demo5";
    }
    @RequestMapping("/demo6")
    public String demo6(Model model){
        model.addAttribute("now",new Date());

        Double price=000.8965D;

        model.addAttribute("price",price);
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;

        model.addAttribute("str",str);
        model.addAttribute("str2","11111");


        return "demo6";
    }

    public String test1(Long id){
        System.out.println("小白增加test1");
        return "test1";
    }
    public Integer test2(Integer id){
        System.out.println("小白增加test2");
        return id;
    }
}
