package com.test.ch2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    /**
     * @return
     */
    @GetMapping("/test")
    public String main(){
        return "test";
    }
}
