package com.example.ejercice.design.patterns.punto2.plataforms;

import com.example.ejercice.design.patterns.punto2.Platform;

public class WebPlatform implements Platform {
    @Override
    public void show(String title, String message) {
        System.out.println("[WEB] " + title + ": " + message);
    }
}
