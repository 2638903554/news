//package com.leehom.news.controller;
//
//import com.leehom.news.po.Newsmaker;
//import com.leehom.news.service.NewsmakerService;
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
//@RequestMapping(value = "/news/index/vote")
//public class NewsmakerController {
//
//    @Autowired
//    private NewsmakerService newsmakerService;
//
//    @RequestMapping(value = "list",method = RequestMethod.GET)
//    public ModelAndView list(Map<String,Object>map){
//        List<Newsmaker> newsmakerList = newsmakerService.selectAll();
//        map.put("voteList", newsmakerList);
//        return new ModelAndView("vote",map);
//    }
//
//}
