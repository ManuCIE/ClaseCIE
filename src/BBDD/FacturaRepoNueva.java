package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaRepoNueva {

    static final String DB_URL = "jdbc:mysql://localhost:3306/cie2024";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * from Facturas";

    public void insertar(Factura factura) {
        // Open a connection
        try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(
                    "insert into facturas values('" + factura.getNumFact() + "', '" + factura.getConcepto() + "', "
                            + factura.getImporte() + ")");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void delete(Factura factura) {
        // Open a connection
        try {
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement sentencia = conexion.createStatement();

            String consultaBorrar = "delete from facturas where numero='" + factura.getNumFact() + "'";
            System.out.println(consultaBorrar);
            sentencia.executeUpdate(consultaBorrar);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
