package com.example.notificationservice.service;

import com.example.notificationservice.entity.Notification;
import com.example.notificationservice.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification sendNotification(Notification notification) {
        notification.setSentAt(LocalDateTime.now());
        // Simulate sending notification (e.g., email/SMS)
        System.out.println("Sending " + notification.getType() + " to user " +
                notification.getUserId() + ": " + notification.getMessage());
        return notificationRepository.save(notification);
    }
}
