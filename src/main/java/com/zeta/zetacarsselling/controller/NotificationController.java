package com.zeta.zetacarsselling.controller;

import com.zeta.zetacarsselling.model.Notification;
import com.zeta.zetacarsselling.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/{notificationId}")
    public Optional<Notification> findOne(@PathVariable int notificationId){
        return notificationService.findOne(notificationId);
    }

    @GetMapping("/")
    public List<Notification> findAll(){
        return notificationService.findAll();
    }

    @PostMapping("/")
    public void save(@RequestBody Notification notification){
        notificationService.save(notification);
    }

    @PutMapping("/")
    public void update(@RequestBody Notification notification){
        notificationService.save(notification);
    }

    @DeleteMapping("/{notificationId}")
    public void delete(@PathVariable int notificationId){
        notificationService.delete(notificationId);
    }
}
