package com.iflytek.controller;

import com.iflytek.service.DemoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Description:
 * Created by chaoz2 on 2018/12/19.
 */
@Controller
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/demo/index")
    public void index() {
        demoService.index();
    }

    @PutMapping("/batch/{id}")
    @ApiOperation("batch")
    @ResponseBody
    public String batchInsert(@PathVariable String id) {
        demoService.batchInsert(Long.parseLong(id));
        return "success";
    }

}
