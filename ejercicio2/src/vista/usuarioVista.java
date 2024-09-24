package vista;

import java.util.List;
import modelo.usuario; // Asegúrate de importar la clase usuario.

/**
 *
 * @author javiergimenez
 */
public class usuarioVista {
    
    // Método para mostrar la lista de usuarios
    public void mostrarUsuarios(List<usuario> usuarios) {
        for (usuario usu : usuarios) {
            System.out.println("ID: " + usu.getIdUsuario() + " , nombre usuario: " + usu.getNombre());
        }
    }
    
    // Método para mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
