import org.example.Netflix;
import org.example.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    public void deveNotificarUmUsuario() {
        Netflix netflix = new Netflix("Serie 1", "01/22", 3, 10);
        Usuario usuario = new Usuario("Usuario 1");
        usuario.notificar(netflix);
        netflix.lancarEpisodio();
        assertEquals("Usuario 1, episodio lançado na Netflix{serie='Serie 1', data='01/22', temporada=3, numEpisodios=10}", usuario.getUltimaNotificacao());
    }
}
