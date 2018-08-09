package com.wind.auth.service.impl;

import com.wind.auth.mapper.MenuMapperEx;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author yangying 2017/11/10.
 */
@Service
public class MenuService implements IMenuService {

    @Autowired
    private MenuMapperEx menuMapper;

    @Override
    public Menu findById(long id) {
        return menuMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean add(Menu menu) {
        return menuMapper.insert(menu) > 0;
    }

    @Override
    public boolean insert(Menu menu) {
        return menuMapper.insert(menu) > 0;
    }

    @Override
    public boolean delete(long id) {
        return menuMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean enable(long id) {
        return menuMapper.updateStatus(id, 1) > 0;
    }

    @Override
    public boolean disable(long id) {
        return menuMapper.updateStatus(id, 0) > 0;
    }

    @Override
    public boolean update(Menu menu) {
        return menuMapper.updateByPrimaryKey(menu) > 0;
    }

    @Override
    public List<Menu> find(Map<String, Object> params) {
        return menuMapper.find(params);
    }
}
