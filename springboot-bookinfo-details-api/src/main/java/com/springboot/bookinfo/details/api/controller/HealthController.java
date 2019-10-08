package com.springboot.bookinfo.details.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类HealthController的实现描述: 健康检查的API
 *
 * @author hongyang 2019-10-08 17:03
 */
@RestController
public class HealthController {

    @RequestMapping("/health/status")
    public String healthCheck() {
        return "success";
    }

}
