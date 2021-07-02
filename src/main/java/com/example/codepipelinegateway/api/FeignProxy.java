package com.example.codepipelinegateway.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "codepipeline",url = "http://dev-codepilepline-gateway-lb-1931632959.us-east-2.elb.amazonaws.com/spring-codepipeline")
public interface FeignProxy {

    @GetMapping
    public String retrieveValue();
}
