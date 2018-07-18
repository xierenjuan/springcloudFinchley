package com.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyProviderController {

    @RequestMapping(value = "/getCompanyInfoByProvider", method = RequestMethod.GET)
    @ResponseBody
    public String getCompanyInfoByProvider(@RequestParam("companyName") String companyName){
        // 这里是要和数据库交互， 这里为了操作简单直接返回一个数据。  
        return "provider 查询" + companyName + "公司信息";  
    }  
     
    @RequestMapping(value = "/getTeamInfo", method = RequestMethod.GET)  
    @ResponseBody  
    public String getTeamInfo(@RequestParam("teamName") String teamName){  
        // 返回团队信息。  
        return "provider 查询" + teamName + "团队信息";  
    }  
}  
