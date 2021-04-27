package com.kevinten.senses.interfaces.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensesInvokeApi {

    @GetMapping("checkHealth")
    public String checkHealth() {
        return "ok";
    }
}
