package com.leehom.news.controller;

import com.leehom.news.dto.NewsDto;
import com.leehom.news.po.Type;
import com.leehom.news.service.NewsService;
import com.leehom.news.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping(value = "/news/index/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object> map){
        List<Type> typeList = typeService.selectAll();
        map.put("typeList",typeList);
        return new ModelAndView("type",map);
    }

}
