package com.example.service1;

import com.example.service1.service.RestTemplateTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateTestController {

    private RestTemplateTestService restTemplateTestService;

    @Autowired
    public RestTemplateTestController(RestTemplateTestService restTemplateTestService) {
        this.restTemplateTestService =restTemplateTestService;
    }

    @RequestMapping("/rest/test1")
    public ResponseEntity<?> restTemplateTest1() {
        return ResponseEntity.ok(restTemplateTestService.callPostExternalServer());
    }
}
