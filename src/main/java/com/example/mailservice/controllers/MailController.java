package com.example.mailservice.controllers;

import com.example.mailservice.dtos.MailRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MailController {

    @PostMapping("/xyz/vbn")
    public String sendMail(@RequestBody MailRequestDto mailRequestDto){
        log.info(" received request-body" +mailRequestDto);
        return "mail sent successfully";
    }
}
