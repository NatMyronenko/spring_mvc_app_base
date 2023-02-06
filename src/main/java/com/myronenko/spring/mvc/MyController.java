package com.myronenko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
@RequestMapping("/second")
    public String showSecondView(){
        return "second-view";
    }

}
