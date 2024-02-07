package com.zeta.zetacarsselling.repository;

import com.zeta.zetacarsselling.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
