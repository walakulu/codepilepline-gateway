package com.example.codepipelinegateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "codepipeline",url = "http://dev-codepilepline-gateway-LB-475338089.us-east-2.elb.amazonaws.com/spring-codepipeline")
public interface FeignProxy {

    @GetMapping(value = "/")
    public String retrieveValue();
}
