package com.tedu.exoa.controller;

import com.tedu.exoa.entity.User;
import com.tedu.exoa.service.impl.IUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Slf4j
@RestController("/api")
public class UserController {
    @Resource
    IUserServiceImpl userService;

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @GetMapping("/oneuser")
    public User findUserById(HttpServletRequest request){
        String id = request.getParameter("id");
        return userService.getById(id);
    }
}
