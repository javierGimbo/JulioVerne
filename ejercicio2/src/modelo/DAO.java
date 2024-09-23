/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author javiergimenez
 */
public class DAO {
    
    protected static ConexionBD conexion;
    
    public DAO(){
        DAO.conexion=new ConexionBD("bdUsuarios");//cuidado con el nombre de la bbdd
    }
    
}
