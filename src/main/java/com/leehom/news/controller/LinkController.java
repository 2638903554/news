package com.leehom.news.controller;

import com.leehom.news.po.Link;
import com.leehom.news.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/news/link")
public class LinkController {

    @Autowired
    private LinkService linkService;

    @RequestMapping(value = "list")
    public ModelAndView list(Map<String,Object>map){

        List<Link> linkList = linkService.selectAll();
        map.put("linkList",linkList);
        return new ModelAndView("link",map);
    }

}
