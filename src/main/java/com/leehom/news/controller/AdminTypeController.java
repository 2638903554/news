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

@RequestMapping(value = "news/admin/type")
@RestController
public class AdminTypeController {

    @Autowired
    private TypeService typeService;

//    @RequestMapping(value = "/index")
//    public ModelAndView index(@RequestParam(value = "typeId",required = false) Integer typeId,
//                              Map<String,Object> map){
////        如果typeId不为空
//        if(!StringUtils.isEmpty(typeId)){
//            Type type = typeService.selectTypeById(typeId);
//            map.put("type",type);
//        }
//        return new ModelAndView("admin/type/index",map);
//    }

    /*
    //返回ModelAndView对象
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> map){
        List<Type> typeList = typeService.selectAll();
        map.put("typeList",typeList);
        return new ModelAndView("admin/type/list",map);
    }
     */


    @GetMapping(value = "/list")
    public ResultVO list(){
        List<Type> typeList = typeService.selectAll();
        ResultVO resultVO = new ResultVO();
        resultVO.setData(typeList);
        return ResultVOUtil.success(resultVO);
    }




//    @RequestMapping(value = "/delete",method = RequestMethod.GET)
//    public ModelAndView delete(@RequestParam("typeId") String typeId,
//                               Map<String,Object>map){
//        try {
//            typeService.deleteTypeById(46);
//        }catch (NewsException e){
//            map.put("msg",e.getMessage());
//            map.put("url","/news/admin/type/list");
//            return new ModelAndView("common/error",map);
//        }
//        map.put("msg", ResultEnum.DELETE_TYPE_SUCCESS.getMessage());
//        map.put("url","/news/admin/type/list");
//        return new ModelAndView("common/success",map);
//    }




}
