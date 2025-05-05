package com.mc.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final UUID instanceId = UUID.randomUUID();

    @GetMapping("/instance-info")
    public String getInstanceInfo() {

        System.out.println("Request received at instance running on port " + port);
        return "Instance served by Port: " + port + ". Instance ID: " + instanceId.toString();
    }
}
