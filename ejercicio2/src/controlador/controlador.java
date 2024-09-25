/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.SQLException;
import java.util.List;
import modelo.usuario;
import modelo.usuarioDAO;
import modelo.usuarioDAOInterface;
import vista.usuarioVista;

/**
 *
 * @author javiergimenez
 */
public class controlador {
    private usuarioDAOInterface usuarioDAO;
    private usuarioVista usuarioVista;

    public controlador(usuarioDAOInterface usuarioDAO, usuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
    }
    
    public void listarUsuarios() throws SQLException{
        List<usuario> usuario = usuarioDAO.obtenerUsuario();
        usuarioVista.mostrarUsuarios(usuario);
    }
    
    public void mostrarUsuarios(){
        try{
            List<usuario> usuario = usuarioDAO.obtenerUsuario();
            usuarioVista.mostrarUsuarios(usuario);
        } catch (SQLException ex){
            System.out.println("Error al obtener usuarios " + ex.getMessage());;
        }
    }
    
    public void modificarUsuario(usuario u){
        
    }
    
    
}


