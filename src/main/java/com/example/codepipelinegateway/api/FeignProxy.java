package com.example.codepipelinegateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "codepipeline",url = "localhost:8080")
public interface FeignProxy {

    @GetMapping(value = "/spring-codepipeline")
    public String retrieveValue();
}
