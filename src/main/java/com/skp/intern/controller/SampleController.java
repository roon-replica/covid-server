package com.skp.intern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/sample/rest")
    @ResponseBody
    public String responseRest(){
        return "hello";
    }

    @GetMapping("/sample/view")
    public String responseView(){
        return "test";
    }

}
