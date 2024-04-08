package cn.bdqn.service.impl;

import cn.bdqn.bean.FoodType;
import cn.bdqn.mapper.FoodTypeMapper;
import cn.bdqn.service.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodTypeServiceImpl implements FoodTypeService {

    @Autowired
    private FoodTypeMapper foodTypeMapper;

    @Override
    public List<FoodType> getFoodTypeAll() {
        return foodTypeMapper.getFoodTypeAll();
    }
}
