package com.leehom.news.controller;

import com.leehom.news.po.Vote;
import com.leehom.news.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/news/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(Map<String,Object>map){
        List<Vote> voteList = voteService.selectAll();
        map.put("voteList",voteList);
        return new ModelAndView("vote",map);
    }

}
