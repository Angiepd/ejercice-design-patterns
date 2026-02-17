package com.example.ejercice.design.patterns.punto2.notifications;

import com.example.ejercice.design.patterns.punto2.Notification;
import com.example.ejercice.design.patterns.punto2.Platform;

public class MessageNotification extends Notification {

    public MessageNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("Mensaje", message );
    }
}
