package com.tedu.exoa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tedu.exoa.entity.User;
import com.tedu.exoa.mapper.UserMapper;
import com.tedu.exoa.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectList(null);
    }

}
