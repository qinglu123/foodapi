package cn.bdqn.controller;

import cn.bdqn.bean.FoodType;
import cn.bdqn.service.FoodTypeService;
import cn.bdqn.vo.DataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodTypeController {

    @Autowired
    private FoodTypeService foodTypeService;

    /**
     * 食物分类查询
     * @return
     */
    @RequestMapping(value = "/buyer/product/list",method = RequestMethod.GET)
    public DataView getFoodTypeAll(){
            DataView<FoodType> dataView = new DataView<>();
        try {
            List<FoodType> list = foodTypeService.getFoodTypeAll();
            dataView.setCode(0);
            dataView.setMsg("成功");
            dataView.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            dataView.setCode(-1);
            dataView.setMsg("失败");
        }
        return dataView;
    }
}
