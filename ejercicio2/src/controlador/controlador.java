/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.usuarioDAO;
import vista.usuarioVista;

/**
 *
 * @author javiergimenez
 */
public class controlador {
    private final usuarioDAO usuarioDAO;
    private final usuarioVista usuarioVista;
    
    public void listarUsuarios(){
        try{
            List<usuario> usuarios = usuarioDAO.obtenerUsuarios();
        } catch(SQLException e){
            usuarioVista.mostrarUsuarios("Error al obtenet usuario: " + e.getMessage);
            
        }
    }
    
}
