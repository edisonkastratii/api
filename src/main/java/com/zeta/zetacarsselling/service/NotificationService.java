package com.zeta.zetacarsselling.service;

import com.zeta.zetacarsselling.model.Notification;
import com.zeta.zetacarsselling.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Optional<Notification> findOne(int id){
        return notificationRepository.findById(id);
    }

    public List<Notification> findAll(){
        return notificationRepository.findAll();
    }

    public void save(Notification notification){
        notificationRepository.save(notification);
    }

    public void delete(int id){
        notificationRepository.deleteById(id);
    }
}
