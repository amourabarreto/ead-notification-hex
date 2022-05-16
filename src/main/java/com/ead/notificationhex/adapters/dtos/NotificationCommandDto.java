package com.ead.notificationhex.adapters.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class NotificationCommandDto {
    private String tittle;
    private String message;
    private UUID userId;

}
