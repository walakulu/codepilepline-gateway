package com.example.codepipelinegateway.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @Autowired
    FeignProxy feignProxy;

    @GetMapping("/gateway")
    public String callService() {
        return feignProxy.retrieveValue();
    }

    @GetMapping("/test")
    public String test() {
//        return feignProxy.retrieveValue();
        return "Inside Gateway response";
    }
}
