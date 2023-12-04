package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final Kafka kafka;

    @GetMapping("/send")
    public String send(){
        kafka.sendMessage("23322");
        return "success";
    }

}
