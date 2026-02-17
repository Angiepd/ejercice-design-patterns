package com.example.notifications.bridge.notifications;

import com.example.notifications.bridge.Notification;
import com.example.notifications.bridge.Platform;

public class MessageNotification extends Notification {

    public MessageNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("Mensaje", message );
    }
}
