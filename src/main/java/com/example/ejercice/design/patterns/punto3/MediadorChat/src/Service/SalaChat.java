package Service;

import Entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements MediadorChat {

    private final List<Usuario> usuarios = new ArrayList<>();

    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("[Grupo 9] Usuario conectado: " + usuario.getNombre());
    }

    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("[Grupo 9] Enviando mensaje de " + usuario.getNombre() + " a los demás usuarios...");
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibir(usuario.getNombre(), mensaje);
            }
        }
    }
}
