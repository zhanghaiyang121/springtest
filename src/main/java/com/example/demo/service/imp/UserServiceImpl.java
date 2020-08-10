package com.example.demo.service.imp;

import com.example.demo.bean.UserBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        System.out.println(name+"-"+password);
        return userMapper.getInfo(name,password);
    }

    @Override
    public List<UserBean> getall() {
        return userMapper.getall();
    }
}
