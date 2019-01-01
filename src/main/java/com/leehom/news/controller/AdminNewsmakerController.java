package com.leehom.news.controller;

import com.leehom.news.enums.ResultEnum;
import com.leehom.news.exception.NewsException;
import com.leehom.news.po.Newsmaker;
import com.leehom.news.service.NewsmakerService;
import com.leehom.news.utils.ResultVOUtil;
import com.leehom.news.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/news/admin/newsmaker")
@Api(value = "/news/admin/newsmaker",tags = "后台新闻人物接口")
public class AdminNewsmakerController {

    @Autowired
    private NewsmakerService newsmakerService;


    /**
     * 添加单条新闻人物
     * @param newsmaker
     * @return
     */
    @PostMapping(value = "/insert")
    public ResultVO insert(Newsmaker newsmaker){
        int result = newsmakerService.insertNewsmaker(newsmaker);
        if(result != 1){
            throw new NewsException(ResultEnum.INSERT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmaker);
    }

    /**
     * 根据id删除单条新闻人物数据
     * @param newsmakerId
     * @return
     */
    @GetMapping(value = "/delete")
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

    /**
     * 根据id查找单条新闻人物数据
     * @param newsmakerId
     * @return
     */
    @GetMapping(value = "/select")
    public ResultVO select(@RequestParam(value = "newsmakerId") Integer newsmakerId){
        Newsmaker newsmaker = newsmakerService.selectNewsmakerById(newsmakerId);
        if(newsmaker == null){
            throw new NewsException(ResultEnum.SELECT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmaker);
    }

    @GetMapping(value = "count")
    public ResultVO count(){
        Integer result = newsmakerService.newsmakerCount();
        return ResultVOUtil.success(result);
    }

    /**
     * 查找所有新闻人物数据
     * @return
     */
    @GetMapping(value = "/list")
    public ResultVO list(){
        List<Newsmaker> newsmakerList = newsmakerService.selectAll();
        if(newsmakerList == null && newsmakerList.size() == 0){
            throw new  NewsException(ResultEnum.SELECT_NEWSMAKER_FAIL);
        }
        return ResultVOUtil.success(newsmakerList);
    }

    /**
     * 更新新闻人物数据
     * @param newsmaker
     * @return
     */
    @PostMapping(value = "/update")
    public ResultVO update(Newsmaker newsmaker){
        int result = newsmakerService.updateNewsmaker(newsmaker);
        if(1 != result){
            throw new NewsException(ResultEnum.UPDATE_NEWSMAKER_FAIL);
        };
        return ResultVOUtil.success(newsmaker);
    }

}
