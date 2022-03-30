package com.example.userrabbitmqtest.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final AmqpTemplate template;

    @GetMapping("")
    public String hello() {
        log.info("GET:hello()");
        template.convertAndSend("queue1","Hello!");
        return "Message sent";
    }
}
