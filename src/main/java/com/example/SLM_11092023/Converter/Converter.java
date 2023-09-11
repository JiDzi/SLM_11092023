package com.example.SLM_11092023.Converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Converter {

    @GetMapping("/{hour}")
    public String convertToAMPM(@PathVariable int hour) {

        if (hour <= 12) {
            if (hour == 12) {
                return hour + " PM";
            } else {
                return hour + " AM";
            }
        } else {
            return (hour - 12) + " PM";
        }
    }
}
