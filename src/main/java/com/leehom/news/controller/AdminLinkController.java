package com.leehom.news.controller;

import com.leehom.news.po.Link;
import com.leehom.news.service.LinkService;
import com.leehom.news.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/news/admin/link")
public class AdminLinkController {
    @Autowired
    private LinkService linkService;

    @PostMapping(value = "/insert")
    public ResultVO insert(@RequestParam("linkName") String linkName,
                           @RequestParam("linkUrl") String linkUrl){
        Link link = new Link();
        link.setLinkName(linkName);
        link.setLinkUrl(linkUrl);


    }

}
