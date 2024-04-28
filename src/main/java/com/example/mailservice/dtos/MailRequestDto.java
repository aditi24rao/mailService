package com.example.mailservice.dtos;

import lombok.Data;

@Data
public class MailRequestDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
