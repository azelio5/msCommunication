package com.mc.consumer.httpinterface;

import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
@Service
public interface ProviderHttpInterface {

    @GetExchange("/instance-info")
    String getInstanceInfo();
}
