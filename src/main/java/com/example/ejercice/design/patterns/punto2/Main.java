package com.example.ejercice.design.patterns.punto2;

import com.example.ejercice.design.patterns.punto2.notifications.AlertNotification;
import com.example.ejercice.design.patterns.punto2.notifications.ConfirmationNotification;
import com.example.ejercice.design.patterns.punto2.notifications.MessageNotification;
import com.example.ejercice.design.patterns.punto2.notifications.WarningNotification;
import com.example.ejercice.design.patterns.punto2.plataforms.DesktopPlatform;
import com.example.ejercice.design.patterns.punto2.plataforms.MobilePlatform;
import com.example.ejercice.design.patterns.punto2.plataforms.WebPlatform;

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
