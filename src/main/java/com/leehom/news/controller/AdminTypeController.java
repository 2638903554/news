package com.leehom.news.controller;

import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Type;
import com.leehom.news.service.TypeService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RequestMapping(value = "/news/admin/type")
@RestController
public class AdminTypeController {

    @Autowired
    private TypeService typeService;

    @PostMapping(value = "/insert")
    public ResultVO insert(@RequestParam("typeName") String typeName){

        Type type = new Type();
        type.setTypeName(typeName);
        int result = typeService.insertType(type);
        if(1 != result){
            return ResultVOUtil.error(ResultEnum.INSERT_TYPE_ERROR.getCode(),ResultEnum.INSERT_TYPE_ERROR.getMessage());
        }
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/delete")
    public ResultVO delete(@RequestParam("typeId") Integer typeId){

        try {
            typeService.deleteTypeById(typeId);
        }catch (NewsException e){
            return ResultVOUtil.error(ResultEnum.DELETE_TYPE_SUCCESS.getCode(),ResultEnum.DELETE_TYPE_SUCCESS.getMessage());
        }
        return ResultVOUtil.success();
    }

    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam("typeId") Integer typeId){

        Type type = typeService.selectTypeById(typeId);
        if(null == type){
            return ResultVOUtil.error(ResultEnum.TYPEID_ERROR.getCode(),ResultEnum.TYPEID_ERROR.getMessage());
        }
        return ResultVOUtil.success(type);
    }

    @GetMapping(value = "/list")
    public ResultVO list(){
        List<Type> typeList = typeService.selectAll();
        return ResultVOUtil.success(typeList);
    }

    @PostMapping(value = "/update")
    public ResultVO update(@RequestParam("typeId") Integer typeId,
                           @RequestParam("typeName") String typeName){
        Type type = new Type();
        type.setTypeId(typeId);
        type.setTypeName(typeName);
        int result = typeService.updateType(type);
        if(1 != result){
            return ResultVOUtil.error(ResultEnum.UPDATE_TYPE_ERROR.getCode(),ResultEnum.UPDATE_TYPE_ERROR.getMessage());
        }
        return ResultVOUtil.success();
    }



}
