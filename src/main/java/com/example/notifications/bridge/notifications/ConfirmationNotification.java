package com.example.notifications.bridge.notifications;

import com.example.notifications.bridge.Notification;
import com.example.notifications.bridge.Platform;

public class ConfirmationNotification extends Notification {

    public ConfirmationNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("✅ Confirmación", message);
    }
}
