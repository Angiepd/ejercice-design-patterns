package com.example.ejercice.design.patterns.punto2;


public abstract class Notification {
    protected Platform platform;

    protected Notification(Platform platform) {
        this.platform = platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public abstract void send(String message);
}
