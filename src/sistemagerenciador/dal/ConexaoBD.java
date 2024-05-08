package sistemagerenciador.dal;

import java.sql.*;

public class ConexaoBD {
    public static Connection conector() {
        java.sql.Connection conexaobd = null;
        
        String wDriver = "com.mysql.cj.jdbc.Driver";

       String wURL = "jdbc:mysql://localhost:3306/arqs_integracaodados";
        String wUser = "root";
        String wPassword = "root";

        try {
            Class.forName(wDriver);
            conexaobd = DriverManager.getConnection(wURL, wUser, wPassword);
            return conexaobd;
        } catch (Exception e) {
            return null;
        }
    }
}

