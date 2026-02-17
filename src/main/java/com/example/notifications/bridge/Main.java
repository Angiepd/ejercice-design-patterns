package com.example.notifications.bridge;

import com.example.notifications.bridge.notifications.*;
import com.example.notifications.bridge.plataforms.DesktopPlatform;
import com.example.notifications.bridge.plataforms.MobilePlatform;
import com.example.notifications.bridge.plataforms.WebPlatform;

public class Main {
    public static void main(String[] args) {
        Platform web = new WebPlatform();
        Platform mobile = new MobilePlatform();
        Platform desktop = new DesktopPlatform();

        Notification n1 = new MessageNotification(web);
        Notification n2 = new AlertNotification(mobile);
        Notification n3 = new WarningNotification(desktop);
        Notification n4 = new ConfirmationNotification(web);

        n1.send("Hola desde la web");
        n2.send("Batería baja");
        n3.send("Espacio en disco insuficiente");
        n4.send("¿Deseas continuar?");

        n1.setPlatform(mobile);
        n1.send("Plataforma cambiada dinámicamente");
    }
}
