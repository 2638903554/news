//package com.leehom.news.controller;
//
//import com.leehom.news.po.Nav;
//import com.leehom.news.service.NavService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@Slf4j
//@RequestMapping(value = "/news/index/type")
//public class NavController {
//
//    @Autowired
//    private NavService navService;
//
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public ModelAndView list(Map<String,Object> map){
//        List<Nav> typeList = navService.selectAll();
//        map.put("typeList",typeList);
//        return new ModelAndView("type",map);
//    }
//
//}
