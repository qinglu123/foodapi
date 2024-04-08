package cn.bdqn.mapper;

import cn.bdqn.bean.FoodType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FoodTypeMapper {
    List<FoodType> getFoodTypeAll();
}
