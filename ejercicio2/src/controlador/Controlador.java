package controlador;

import modelo.UsuarioDAO; 
import modelo.Usuario; 
import vista.UsuarioVista; 
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javiergimenez
 */
public class Controlador {  // Cambia el nombre de la clase a Controlador
    private final UsuarioDAO usuarioDAO;
    private final UsuarioVista usuarioVista;
    
    public Controlador() {  // Asegúrate de que el constructor esté correctamente definido
        this.usuarioDAO = new UsuarioDAO();
        this.usuarioVista = new UsuarioVista();
    }
     
    public void listarUsuarios() {
        try {
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            usuarioVista.mostrarUsuarios(usuarios); // Mostrar usuarios
        } catch (SQLException e) {
            usuarioVista.mostrarMensaje("Error al obtener usuarios: " + e.getMessage()); // Mostrar mensaje de error
        }
    }
}
