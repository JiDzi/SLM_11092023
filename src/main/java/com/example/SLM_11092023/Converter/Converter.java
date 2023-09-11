package com.example.SLM_11092023.Converter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/time")
public class Converter {

    @GetMapping
    public String convertToAMPM(@RequestParam("h") int hour){

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
