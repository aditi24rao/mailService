package com.example.mailservice.services.impl;

import com.example.mailservice.dtos.MailRequestDto;
import com.example.mailservice.services.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailServiceImpl implements MailService {
    @Override
    public String sendMail(MailRequestDto mailRequestDto) {
        log.info("received mail" +mailRequestDto);
        return " mail sent successfully";
    }
}
