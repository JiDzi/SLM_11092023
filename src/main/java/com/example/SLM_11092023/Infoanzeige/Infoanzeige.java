package com.example.SLM_11092023.Infoanzeige;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/time")
public class Infoanzeige {

    @GetMapping("/info")
    public String getInfo() {
        return "This API converts 24h time into AM/PM time.";
    }
}
