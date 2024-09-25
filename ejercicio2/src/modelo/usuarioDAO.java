/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;



/**
 *
 * @author javiergimenez
 */
public class usuarioDAO extends DAO implements usuarioDAOInterface {
    
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
    
   public void insertarUsuario(usuario usuario) throws SQLException {
    String sql = "INSERT INTO usuario (id_usuario, nombre, contraseña) VALUES (?, ?, ?)";
    PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
    statement.setInt(1, usuario.getIdUsuario());
    statement.setString(2, usuario.getNombre());
    statement.setString(3, usuario.getContraseña());
    statement.executeUpdate(); 
}
   
  //public usuario verUsuario
   public usuario verUsuario(Integer id) throws SQLException{
       String nombre, contraseña;
       String sql = "select * from usuarios where idUsuario= " +id;
       Statement statement = conexion.getConexion().createStatement();
       ResultSet cursor = statement.executeQuery(sql);
       if(cursor.next()){
           nombre = cursor.getString("nombre");
           contraseña = cursor.getString("contraseña");
           return new usuario(id, nombre, contraseña);
       }
       return null;
   }
   
   
  public void modificarUsuario(usuario u){
      String sql = "update usuarios set nombre=?, contraseña=? where idUsuario=?";
      PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
      
      statement.setString(1, u.getNombre());
      statement.setString(2, u.getContraseña());
      statement.setInt(3, u.getIdUsuario());
      statement.executeUpdate();
  }
   
  public boolean borrarUsuario(Integer id) throws SQLException{
      int n;
      boolean exito=false;
      String sql ="delete from usuarios where idUsuario=?";
      PreparedStatement statement = conexion.getConexion().prepareStatement(sql);
      statement.setInt(1,id);
      n=statement.executeUpdate();
      if(n!=0)
          exito=true;
      return exito;
  }
   
  
}
