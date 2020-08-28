package com.cromwell.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie Kaihan
 * @date 2020/07/09
 * @description controller
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }
}
