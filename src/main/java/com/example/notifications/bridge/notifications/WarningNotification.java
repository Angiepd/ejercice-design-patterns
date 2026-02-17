package com.example.notifications.bridge.notifications;

import com.example.notifications.bridge.Notification;
import com.example.notifications.bridge.Platform;

public class WarningNotification extends Notification {

    public WarningNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("⚠\uFE0F Advertencia", message);
    }
}
