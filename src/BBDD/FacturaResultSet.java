package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaResultSet {

    static final String DB_URL = "jdbc:mysql://localhost:3306/cie2024";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * from Personas";

    public void insertar(Factura factura) {

        try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();

            sentencia.executeUpdate("insert into facturas values ('" + factura.getNumFact() + "','"
                    + factura.getConcepto() + "'," + factura.getImporte() + ")");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void borrar(Factura factura) {

        try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();

            String consultaBorrar = "delete from Facturas where numero='" + factura.getNumFact() + "'";

            System.out.println(consultaBorrar);

            sentencia.executeUpdate(consultaBorrar);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public ResultSet buscarTodos() {

        ResultSet rs = null;
        try {
            // conecto a la base de datos
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            // preparo la sentencia
            Statement sentencia = conexion.createStatement();
            // ejecuto
            rs = sentencia.executeQuery("select * from Facturas");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet buscarNum() {

        ResultSet rs = null;
        try {
            // conecto a la base de datos
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            // preparo la sentencia
            Statement sentencia = conexion.createStatement();
            // ejecuto
            rs = sentencia.executeQuery("SELECT `Numero` FROM `facturas` WHERE 1");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

}