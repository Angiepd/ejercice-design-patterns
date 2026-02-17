package com.example.ejercice.design.patterns.punto2.notifications;

import com.example.ejercice.design.patterns.punto2.Notification;
import com.example.ejercice.design.patterns.punto2.Platform;

public class WarningNotification extends Notification {

    public WarningNotification(Platform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("⚠\uFE0F Advertencia", message);
    }
}
