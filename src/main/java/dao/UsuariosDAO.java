package dao;

import bean.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDAO {

    public void inserir(Usuarios u) {
        String sql = "INSERT INTO abl_usuarios "
                + "(abl_nome, abl_login, abl_senha, abl_nivel, abl_telefone, abl_ativo) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = ConexaoDAO.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getSenha());
            ps.setInt(4, u.getNivel());
            ps.setString(5, u.getTelefone());
            ps.setString(6, u.getAtivo());
            ps.execute();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }
}