package BBDD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalResultSet {

    public static void main(String[] args) {
        // instancio repositorio
        PersonaResultSet repo = new PersonaResultSet();
        // lamo al metodo buscarTodos()
        // devuelve un ResultSet y lo asociamos
        ResultSet rs = repo.buscarTodos();
        // creado ResultSet lo recorro con while rs<--como hemos llamado al resultset
        // +.next()
        // sourround with e
        try {
            while (rs.next()) {

                System.out.println("Persona :");
                System.out.print(rs.getString("nombre") + " ");
                System.out.print(rs.getString("apellidos") + ", ");
                System.out.println(rs.getString("edad") + ".");

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ResultSet rs2 = repo.buscarSur();
        System.out.println("Apellidos de la BBDD:");
        try {
            while (rs2.next()) {
                System.out.println(rs2.getString("apellidos"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}