package com.szhqfy.gov.controller;

import com.szhqfy.gov.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestC
{
    @Autowired
    private  TestMapper testMapper;

    @RequestMapping("/")
    @ResponseBody
    public Object rrr(){

        return "fdsfsdf"+testMapper.test("").get(0);
    }
}
