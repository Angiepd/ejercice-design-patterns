import Entity.Usuario;
import Service.SalaChat;

public class Main {
    public static void main(String[] args) {
        // 1) Crear mediador
        SalaChat GrupoNueve = new SalaChat();

        // 2) Crear usuarios
        Usuario Rosemberg = new Usuario("Rosemberg", GrupoNueve);
        Usuario Juan = new Usuario("Juan", GrupoNueve);
        Usuario Yesid = new Usuario("Yesid", GrupoNueve);

        // 3) Enviar mensajes
        Rosemberg.enviar("Hola a todos, Cómo están?");
        Juan.enviar("Hola, muy bien! Ustedes que tal?");
        Yesid.enviar("Holaaaaa! Muy bien, gracias!");

        // 4) Escalabilidad
        Usuario Ivan = new Usuario("Iván", GrupoNueve);
        Ivan.enviar("Cómo van? Saben cual es el trabajo que toca hacer para la clase? ");

        Usuario Angie = new Usuario("Angie", GrupoNueve);
        Angie.enviar("Hola! Recién veo el grupoo, les parece si nos reunimos? ");
    }
}
