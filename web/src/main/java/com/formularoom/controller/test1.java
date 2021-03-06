package com.formularoom.controller;

import com.formularoom.testUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by fr on 2017/4/01.
 */
@Controller
public class test1 {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        return "spring boot multiple modules test";
    }

    @RequestMapping(value = "/test2/{nu1}/{nu2}", method = RequestMethod.GET)
    @ResponseBody
    public  HashMap<String, Object> test2(@PathVariable int nu1, @PathVariable int nu2) {
        HashMap<String, Object> strMap = new HashMap<String, Object>();
        strMap.put("result",  nu1 + "+" + nu2 + "=" + testUtils.add(nu1,nu2));
        return strMap;
    }
}
