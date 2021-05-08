package com.mouhamadjradeh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontrol {
    @RequestMapping(value="/")
    public String greeting(){return "Hi, Welcome to springboot";}
    @GetMapping(value = "/{name}")
    public String greetingwithname(@PathVariable  String name){return String.format("Welcome %s to our springboot App",name);}//byekhod el variable men {}, String.format tyekhod el %s
}
