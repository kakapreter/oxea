package com.tedu.exoa.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.tedu.exoa.entity.User;
import java.util.List;

public interface IUserService extends IService<User> {
    public List<User> findAllUser();
}
