package com.mc.consumer.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feign")
@RequiredArgsConstructor
public class FeignController {

    private final ProviderFeignClient feignClient;

    @GetMapping("/instance")
    public String getInstance(){
        return feignClient.getInstanceInfo();
    }
}
