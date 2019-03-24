package com.example.democlient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping
    public String client() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(UriComponentsBuilder
                .fromUriString("//demo/hello")
                .build()
                .toUriString(), String.class);

        System.out.println(responseEntity.getBody());

        return responseEntity.getBody();
    }

}
