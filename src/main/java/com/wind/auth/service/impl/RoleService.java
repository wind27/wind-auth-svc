package com.wind.auth.service.impl;

import com.wind.auth.mapper.RoleMapperEx;
import com.wind.auth.model.Role;
import com.wind.auth.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * RoleService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleMapperEx roleMapper;

    @Override
    public boolean add(Role role) {
        return roleMapper.insert(role)>0;
    }

    @Override
    public boolean delete(long id) {
        return roleMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean update(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role)>0;
    }

    @Override
    public Role findById(long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> find(Map<String, Object> params) {
        return roleMapper.selectByMap(params);
    }
}
