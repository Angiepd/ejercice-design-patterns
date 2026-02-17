package com.example.ejercice.design.patterns.punto2.plataforms;

import com.example.ejercice.design.patterns.punto2.Platform;

public class DesktopPlatform implements Platform {
    @Override
    public void show(String title, String message) {
        System.out.println("[ESCRITORIO] " + title + ": " + message);
    }
}
