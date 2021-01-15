package com.prateekbangre.employee_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prateek.bangre on 29/12/20.
 * @Project employee_api
 */
@RestController
public class HealthCheck {

    @GetMapping("/healthcheck")
    private String getHealthCheck() {
        return "working.....!!!!!";
    }
}
