package Service;

import Entity.Usuario;

public interface MediadorChat {
    void enviar(String mensaje, Usuario usuario);
}
