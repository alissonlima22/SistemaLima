package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public static Connection conectar() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/abl_petshop_sistema";
            String usuario = "root";
            String senha = "";

            conn = DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {

            System.out.println("Erro de conexão: " + e.getMessage());

        }

        return conn;
    }
}
