/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author javiergimenez
 */
public class ConexionBD {
    protected String drivermysql;
    protected String url;
    protected Connection conexion;
    protected String usuario;
    protected String pass;

    public ConexionBD(String nombreBD) {
        this.usuario = "root";
        this.pass = "Root.1234";

        this.drivermysql = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/" + nombreBD;
        try {
            //1º se pasan los drivers
            Class.forName(drivermysql);//puede generar "class not found"

            //2º establecer la conexión a la base de datos
            this.conexion = DriverManager.getConnection(url, usuario, pass);

            System.out.println("Conexión establecida exitosamente");

        } catch (ClassNotFoundException e1) {
            System.err.println("Se produjo error al no encontrar la clase");
            System.err.println(e1);
        } catch (SQLException e2) {
            System.err.println("No hay ningún driver registrado que reconozca la URL especificada");
            System.err.println(e2);
        } catch (Exception e3) {
            System.err.println("Se ha producido un error desconocido");
            System.err.println(e3);
        }

    }

    Object getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
