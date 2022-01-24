package com.luospace.schrodingerscat.controller;

import com.luospace.schrodingerscat.common.Result;
import com.luospace.schrodingerscat.service.ExperimentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
public class SiteController {
    @Resource
    ExperimentService experimentService;

    @GetMapping({"", "/", "/index", "/index.html"})
    public String index(){
        return "index";
    }

    @GetMapping("/open")
    @ResponseBody
    public Result open(HttpServletRequest request){
        return experimentService.todo(request);
    }

}
