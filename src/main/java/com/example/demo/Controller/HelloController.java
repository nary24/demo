package com.example.demo.Controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hello")
    public String hello() {
    return "hello world";
}

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello world22";
    }

}
