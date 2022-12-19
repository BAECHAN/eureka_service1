package com.example.service1;

import com.example.service1.service.RestTemplateTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableDiscoveryClient
public class DController {
    @Autowired
    DService discoveryService;

    private RestTemplateTestService restTemplateTestService;

    @Autowired
    public DController(RestTemplateTestService restTemplateTestService) {
        this.restTemplateTestService =restTemplateTestService;
    }

    @GetMapping(value = "/services")
    public List<String> services() {
        return discoveryService.getServices();
    }

    @RequestMapping("/rest/test2")
    public ResponseEntity<?> restTemplateTest1() {
        return ResponseEntity.ok(restTemplateTestService.callPostExternalServer());
    }

}