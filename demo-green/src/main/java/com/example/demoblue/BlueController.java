package com.example.demoblue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class BlueController {

    @GetMapping
    public String hello() {
        return "Hello from Green";
    }
}

cf map-route demo-green-techprimers https://demo-app-techprimers.cfapps.io