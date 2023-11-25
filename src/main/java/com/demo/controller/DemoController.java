package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/testApp")
    public String getMessage()
    {
        return "This first GENKINS application";
    }

}
