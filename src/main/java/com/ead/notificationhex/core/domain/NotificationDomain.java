package com.ead.notificationhex.core.domain;

import com.ead.notificationhex.core.domain.enums.NotificationStatus;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class NotificationDomain implements Serializable {

private static final long serialVersionUID = 1L;

    private UUID notificationId;
    private UUID userId;
    private String tittle;
    private String message;
    private LocalDateTime creationDate;
    private NotificationStatus notificationStatus;
}
