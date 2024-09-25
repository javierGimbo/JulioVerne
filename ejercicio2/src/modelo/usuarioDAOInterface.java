/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.sql.SQLException;


/**
 *
 * @author javiergimenez
 */
public class usuarioDAOInterface {
    
    public void insertarUsuario(usuario u) throws SQLException;
    public List<usuario> obtenerUsuario() throws SQLException;
    public usuario verUsuario(Integer id) throws SQLException;
    public void modificarUsuario(usuario u) throws SQLException;
    public boolean borrarUsuario(Integer id) throws SQLException;

}
