package com.example.mailservice.services;

import com.example.mailservice.dtos.MailRequestDto;

public interface MailService {
    String sendMail(MailRequestDto mailRequestDto);
}
