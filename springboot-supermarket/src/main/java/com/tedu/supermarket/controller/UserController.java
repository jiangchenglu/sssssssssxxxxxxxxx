package com.tedu.supermarket.controller;

//新建一个控制器，把控制器交给spring管理
//用户请求--前端控制器

import com.tedu.supermarket.pojo.User;
import com.tedu.supermarket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usercontroller")
public class UserController {

    @Autowired
    public IUserService iUserService;


    @RequestMapping("/login")  //当用户请求时usercontroller/login时，执行该方法
    public String login(User user, Model model) {

        System.out.println("页面传入用户信息是：" + user);

        int i = iUserService.queryUser(user);
        if (i == 1) {
            model.addAttribute("keycode", "2010");
            model.addAttribute("msg", "登陆成功！");
        } else {
            model.addAttribute("keycode", "2011");
            model.addAttribute("msg", "登陆失败！");
        }

//
//        if (user != null && user.getName().equals("admin") && user.getPassword().equals("admin")) {
//            model.addAttribute("keycode", "111111");
//            model.addAttribute("msg", "登陆成功");
//
//        } else {
//            model.addAttribute("keycode", "000000");
//            model.addAttribute("msg", "登陆失败");
//        }

        return "user"; //加上前后缀:/templates/user.html
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user, Model model) {
        System.out.println(user);
        int userByUserName = iUserService.findUserByUserName(user.getName());
        if (userByUserName != 0) {
            model.addAttribute("msg", "用户名已存在！");
        } else if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("msg", "两次密码不一致!");
        } else {
            iUserService.registerUser(user);
            return "login";
        }

        return "register";
    }
}