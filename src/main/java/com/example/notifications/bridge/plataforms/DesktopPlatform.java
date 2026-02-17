package com.example.notifications.bridge.plataforms;

import com.example.notifications.bridge.Platform;

public class DesktopPlatform implements Platform {
    @Override
    public void show(String title, String message) {
        System.out.println("[ESCRITORIO] " + title + ": " + message);
    }
}
