package com.skp.intern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CovidApiController {
    private static final String BASE_URL = "https://api.covid19api.com";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/api/summary")
    public String summary() {
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "/summary", String.class);
        Assert.notNull(response,"response must not null");

        HttpStatus status = response.getStatusCode();

        return response.getBody();
    }
}
