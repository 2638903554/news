package com.leehom.news.controller;

import com.leehom.news.po.Type;
import com.leehom.news.service.NewsService;
import com.leehom.news.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RequestMapping(value = "news/admin")
@Controller
public class AdminNewsController {

    @Autowired
    private TypeService typeService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> map){
        List<Type> typeList = typeService.selectAll();
        map.put("typeList",typeList);
        return new ModelAndView("admin/type",map);
    }

//    @RequestMapping(value = "update",method = RequestMethod.GET)
//    public ModelAndView update(@RequestParam("typeId") String typeId,
//                               Map<String,Object>map){
////        Type result = typeService
//    }


}
