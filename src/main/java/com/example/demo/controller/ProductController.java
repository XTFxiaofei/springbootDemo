package com.example.demo.controller;

import com.example.demo.entity.Foods;
import com.example.demo.entity.JsonData;
import com.example.demo.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:fly
 * @Description:
 * @Date:11:38 2018/7/30
 */
@Slf4j
@RestController
public class ProductController {

    /**
     * @Date:16:24 2018/7/31
     * @Description:
     * @Param:  * @param
     * @Return:
     */
    @RequestMapping(value="/getproduct",method=RequestMethod.GET)
    public List<Product> getProduct(){
        Foods foods=new Foods("123456","皮蛋粥",1.2,"好吃的皮蛋粥","http://xxx.com");
        Product product=new Product("热榜",1,foods);
        log.info("info.....");
        log.warn("warn.....");
        log.debug("debug....");
        log.error("error....");
        List<Product> productList=new ArrayList<>();
        productList.add(product);
        return productList;

    }

    /**
     * @Date:16:46 2018/7/31
     * @Description:
     * @Param:  * @param
     * @Return:
     */
    @RequestMapping(value="/getproductjson",method=RequestMethod.GET)
    public JsonData getProductJson(){
        Foods foods=new Foods("123456","皮蛋粥",1.2,"好吃的皮蛋粥","http://xxx.com");
        Product product=new Product("热榜",1,foods);
        List<Product> productList=new ArrayList<>();
        productList.add(product);
        log.info("info.....");
        log.warn("warn.....");
        log.debug("debug....");
        log.error("error....");
        JsonData jsonData=new JsonData(0,"成功",productList);
        return jsonData;
    }

}
