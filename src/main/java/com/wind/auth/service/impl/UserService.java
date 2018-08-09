package com.wind.auth.service.impl;

import com.wind.auth.mapper.UserMapperEx;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * UserService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapperEx userMapper;

    @Override
    public User findById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public boolean save(User user) {
        return userMapper.insert(user)>0;
    }

    @Override
    public List<User> find(Map<String, Object> params) {
        return userMapper.selectByMap(params);
    }

    @Override
    public boolean update(User user) {
        return userMapper.updateByPrimaryKeySelective(user)>0;
    }
}
