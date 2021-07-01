package com.example.codepipelinegateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "codepipeline",url = "http://internal-dev-test-spring-codepipeline-LB-438161731.us-east-2.elb.amazonaws.com")
public interface FeignProxy {

    @GetMapping(value = "/spring-codepipeline")
    public String retrieveValue();
}
