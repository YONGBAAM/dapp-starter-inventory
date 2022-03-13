package com.drake.dappstarterinventory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping(path = "/hello")
    public String hello() {
        return "hello inventory";
    }
}
