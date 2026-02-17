package com.example.ejercice.design.patterns.punto2.notifications;

import com.example.ejercice.design.patterns.punto2.Notification;
import com.example.ejercice.design.patterns.punto2.Platform;

public class AlertNotification extends Notification {

    public AlertNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("\uD83D\uDEA8 Alerta", message);
    }
}
