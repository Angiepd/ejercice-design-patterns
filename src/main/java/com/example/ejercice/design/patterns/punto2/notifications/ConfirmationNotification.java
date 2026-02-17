package com.example.ejercice.design.patterns.punto2.notifications;

import com.example.ejercice.design.patterns.punto2.Notification;
import com.example.ejercice.design.patterns.punto2.Platform;

public class ConfirmationNotification extends Notification {

    public ConfirmationNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("✅ Confirmación", message);
    }
}
