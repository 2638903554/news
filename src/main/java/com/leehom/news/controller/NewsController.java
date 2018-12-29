//package com.leehom.news.controller;
//
//import com.leehom.news.dto.NewsDto;
//import com.leehom.news.po.Nav;
//import com.leehom.news.service.NewsService;
//import com.leehom.news.service.NavService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@Slf4j
//@RequestMapping(value = "/news/index/news")
//public class NewsController {
//
//    @Autowired
//    private NewsService newsService;
//
//    @Autowired
//    private NavService typeService;
//
//    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    public ModelAndView index(Map<String,Object> map){
//        List<Nav> typeList = typeService.selectAll();
//        map.put("typeList",typeList);
//        List<List<NewsDto>> newsDtoLists = new ArrayList<List<NewsDto>>();
//        for(Nav type:typeList){
//            Integer typeId = type.getTypeId();
//
//            List<NewsDto> newsDtoList = newsService.selectThreeNewsByTypeId(typeId);
//            newsDtoLists.add(newsDtoList);
//        }
//        map.put("newsDtoLists",newsDtoLists);
//        return new ModelAndView("news",map);
//    }
//
//    @RequestMapping(value = "/find",method = RequestMethod.GET)
//    public ModelAndView find(@RequestParam(value = "typeId") Integer typeId,
//                             Map<String,Object>map){
//        List<NewsDto> newsDtoList = newsService.selectNewsByTypeId(typeId);
////        Nav type = typeService
//        map.put("newsDtoList",newsDtoList);
//        return new ModelAndView("findNews",map);
//    }
//
//
//
//}
