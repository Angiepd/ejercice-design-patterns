package Entity;

import Service.MediadorChat;
import Service.SalaChat;

public class Usuario {

    private final String nombre;
    private final MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;

        // Registro en el mediador
        if (mediador instanceof SalaChat) {
            ((SalaChat) mediador).registrar(this);
        } else {
            throw new IllegalArgumentException("Mediador inválido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void enviar(String mensaje) {
        System.out.println("\n" + nombre + " envía: " + mensaje);
        mediador.enviar(mensaje, this);
    }

    public void recibir(String remitente, String mensaje) {
        System.out.println(nombre + " recibe de " + remitente + ": " + mensaje);
    }
}
