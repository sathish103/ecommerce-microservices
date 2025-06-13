package com.example.notificationservice.service;

import com.example.notificationservice.entity.Notification;
import com.example.notificationservice.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification sendNotification(Notification notification) {
        notification.setSentAt(LocalDateTime.now());
        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}
