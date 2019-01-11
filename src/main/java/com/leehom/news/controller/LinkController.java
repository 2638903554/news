package com.leehom.news.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Link;
import com.leehom.news.service.LinkService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/news/link")
@RestController
@Slf4j
public class LinkController {
    @Autowired
    private LinkService linkService;

    @PostMapping(value = "/admin/insert")
    @ApiOperation(value = "后台接口：添加单条友情链接对象数据")
    public ResultVO insert(@RequestBody Link link){
        link.setLinkName(link.getLinkName());
        link.setLinkUrl(link.getLinkUrl());
        link.setLinkRemark(link.getLinkRemark());
        int result = linkService.insertLink(link);
        if(result != 1){
            throw new NewsException(ResultEnum.INSERT_TYPE_ERROR );
        }
        return ResultVOUtil.success(link);
    }

    @GetMapping(value = "/admin/delete")
    @ApiOperation(value = "后台接口：根据linkId删除单条友情链接数据")
    public ResultVO delete(@RequestParam("linkId") Integer linkId){
        Link link = linkService.selectLinkById(linkId);
        if(link == null){
            throw new NewsException(ResultEnum.TYPEID_ERROR);
        }
        int result = linkService.deleteLinkById(linkId);
        return ResultVOUtil.success(link);
    }

    @GetMapping(value = "/admin/select")
    @ApiOperation(value = "后台接口：根据linkId查找单条友情链接数据")
    public ResultVO select(@RequestParam("linkId") Integer linkId){
        Link link = linkService.selectLinkById(linkId);
        if(link == null){
            throw new NewsException(ResultEnum.SELECT_LINK_FAIL);
        }
        return ResultVOUtil.success(link);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "前台/后台接口：获取所有友情链接数据")
    public ResultVO list(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                         @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Link> linkList = linkService.selectAll();
        PageInfo pageInfo = new PageInfo(linkList);
        return ResultVOUtil.success(pageInfo);
    }

    @GetMapping(value = "/admin/count")
    @ApiOperation(value = "后台接口：计算友情链接总数")
    public ResultVO count(){
        Integer result = linkService.countLink();
        return ResultVOUtil.success(result);
    }

    @PostMapping(value = "/admin/update")
    @ApiOperation(value = "后台接口：更新单条友情链接对象数据")
    public ResultVO update(@RequestBody Link link){
        Link result = linkService.selectLinkById(link.getLinkId());
        if(result == null){
            throw new NewsException(ResultEnum.SELECT_LINK_FAIL);
        }
        result.setLinkUrl(link.getLinkUrl());
        result.setLinkName(link.getLinkName());
        if(linkService.updateLink(link) != 1){
            throw new NewsException(ResultEnum.UPDATE_TYPE_ERROR);
        }
        return ResultVOUtil.success(linkService.selectLinkById(link.getLinkId()));
    }

}
