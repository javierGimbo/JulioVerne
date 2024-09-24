/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;



/**
 *
 * @author javiergimenez
 */
public class usuarioDAO extends DAO {
    
    public usuarioDAO(){
        
    }
    
    public List<usuario> obtenerUsuarios() throws SQLException {
        String nombre, contraseña;
        int id;
        List<usuario> usuarios = new ArrayList<>();
        String sql = "Select * from usuario";
        Statement statement = conexion.getConexion().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        while (resultSet.next()){
            id= resultSet.getInt("idUsuario");
            nombre= resultSet.getString("nombre");
            contraseña= resultSet.getString("contraseña");
            usuarios.add(new usuario(id, nombre, contraseña));
        }
        
        return usuarios;
        
    }
    
    public void insertarUsuario(usuario usuario) throws SQLException{
        String sql = "Insert into usuario values(?,?,?)";
        PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
        statement.setInt(1, usuario.getIdUsuario());
        statement.setString(2, usuario.getNombre());
        statement.setString(3, usuario.getContraseña());
        statement.executeUpdate();
        
    }
}
