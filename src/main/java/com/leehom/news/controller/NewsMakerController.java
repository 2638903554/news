package com.leehom.news.controller;

import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Newsmaker;
import com.leehom.news.service.NewsmakerService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news/newsmaker")
public class NewsMakerController {

    @Autowired
    private NewsmakerService newsmakerService;

    @PostMapping(value = "/admin/insert")
    @ApiOperation(value = "后台接口：添加单条新闻人物数据")
    public ResultVO insert(@RequestBody Newsmaker newsmaker){
        int result = newsmakerService.insertNewsmaker(newsmaker);
        if(result != 1){
            throw new NewsException(ResultEnum.INSERT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmaker);
    }

    @ApiOperation(value = "后台接口：根据id删除单条新闻人物数据")
    @GetMapping(value = "/admin/delete")
    public ResultVO delete(@RequestParam(value = "newsmakerId") Integer newsmakerId){
        Newsmaker newsmaker = newsmakerService.selectNewsmakerById(newsmakerId);
        if(newsmaker == null){
            throw new NewsException(ResultEnum.SELECT_NEWSMAKER_FAIL);
        }
        int result = newsmakerService.deleteNewsmakerById(newsmakerId);
        if(result != 1){
            throw new NewsException(ResultEnum.DELETE_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmaker);
    }

    @ApiOperation(value = "前台/后台接口：根据id查找新闻人物数据")
    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam(value = "newsmakerId") Integer newsmakerId){
        Newsmaker newsmaker = newsmakerService.selectNewsmakerById(newsmakerId);
        if(newsmaker == null){
            throw new NewsException(ResultEnum.SELECT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmaker);
    }

    @GetMapping(value = "/admin/count")
    @ApiOperation(value = "后台接口：计算新闻人物总数")
    public ResultVO count(){
        Integer result = newsmakerService.newsmakerCount();
        return ResultVOUtil.success(result);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "前台/后台接口：获取所有新闻人物数据")
    public ResultVO list(){
        List<Newsmaker> newsmakerList = newsmakerService.selectAll();
        if(newsmakerList == null && newsmakerList.size() == 0){
            throw new  NewsException(ResultEnum.SELECT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmakerList);
    }

    @PostMapping(value = "/admin/update")
    @ApiOperation(value = "后台接口：更新新闻人物数据")
    public ResultVO update(@RequestBody Newsmaker newsmaker){
        int result = newsmakerService.updateNewsmaker(newsmaker);
        if(1 != result){
            throw new NewsException(ResultEnum.UPDATE_NEWSMAKER_FAIL);
        };
        return ResultVOUtil.success(newsmaker);
    }

}
